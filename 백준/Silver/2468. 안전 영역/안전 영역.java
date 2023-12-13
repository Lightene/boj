import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main{
    static int[][] table;
    static boolean[][] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        table = new int[N][N];

        int count = 0;

        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < N; j++){
                table[i][j] = Integer.parseInt(st.nextToken());
                set.add(table[i][j]);
            }
        }

        for(int limit : set){
            check = new boolean[N][N];
            int subCount = 0;
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    if(table[i][j] > limit && !check[i][j]){
                        ++subCount;
                        bfs(N, limit, i, j);
                    }
                }
            }

            count = Math.max(count, subCount);
        }

        System.out.println(count);

    }

    public static void bfs(int N, int limit, int a, int b){
        int[] x = { 0, 1, 0, -1};
        int[] y = { -1, 0, 1, 0};

        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{a, b});
        check[a][b] = true;

        while (!q.isEmpty()){
            int[] position = q.poll();
            for(int i = 0; i < 4; i++){
                if(position[0]+x[i] >= 0 && position[0]+x[i] < N &&
                   position[1]+y[i] >= 0 && position[1]+y[i] < N &&
                   table[position[0]+x[i]][position[1]+y[i]] > limit &&
                   !check[position[0]+x[i]][position[1]+y[i]]){
                    check[position[0]+x[i]][position[1]+y[i]] = true;
                    q.add(new int[] {position[0]+x[i], position[1]+y[i]});
                }
            }
        }

    }
}