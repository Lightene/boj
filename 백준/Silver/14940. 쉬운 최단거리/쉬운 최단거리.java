import java.io.*;
import java.util.*;

class Main {

    static int[][] table;
    static boolean[][] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N, M;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int startN = 0;
        int startM = 0;

        table = new int[N][M];
        check = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            table[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (table[i][j] == 2) {
                    startN = i;
                    startM = j;
                    break;
                }
            }
            if (startN != 0 && startM != 0) break;
        }


        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{startN, startM, 0});
        table[startN][startM] = 0;

        int[] y = {1, 0, -1, 0};
        int[] x = {0, -1, 0, 1};

        while (!q.isEmpty()) {
            int[] qp = q.poll();
            for (int i = 0; i < 4; i++) {
                if (qp[0] + y[i] >= 0 && qp[0] + y[i] < N &&
                        qp[1] + x[i] >= 0 && qp[1] + x[i] < M &&
                        table[qp[0] + y[i]][qp[1] + x[i]] == 1 &&
                        !check[qp[0] + y[i]][qp[1] + x[i]]){
                    q.add(new int[]{qp[0] + y[i], qp[1] + x[i], qp[2] + 1});
                    check[qp[0] + y[i]][qp[1] + x[i]] = true;
                    table[qp[0] + y[i]][qp[1] + x[i]] = qp[2]+1;
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(table[i][j] == 1 && !check[i][j]){
                    sb.append(-1);
                }else{
                    sb.append(table[i][j]);
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}