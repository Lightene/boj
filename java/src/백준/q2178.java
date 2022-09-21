package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Vector;

public class q2178 {

        static ArrayDeque<int[]> queue;

        //   시계방향     상,우,하,좌
        static int[] vectorX = {0,1,0,-1};
        static int[] vectorY = {1,0,-1,0};

        static int N,M;

        static int[][] map;
        static int[][] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        queue = new ArrayDeque<>();

        map = new int[N][M];
        check = new int[N][M];

        for(int i = 0; i < N; i++) {
            map[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                check[i][j] = -1;
            }
        }

        check[0][0] = 0;
        queue.offer(new int[]{0,0});
        bfs(0,0);

        System.out.println(check[N-1][M-1]);

    }

    static void bfs(int x, int y){
        while (!queue.isEmpty()){
            int[] now = queue.poll();

            for(int i = 0; i < 4; i++)
            {
                int nextX = vectorX[i] + now[0];
                int nextY = vectorY[i] + now[1];

                // 0 ~ N, 0 ~ M
                if(nextX < 0 || nextX >= M || nextY < 0 || nextY >= N){
                    continue;
                }

                // TODO 의심
                if(map[nextY][nextX] == 0 || check[nextY][nextX] != -1){
                    continue;
                }

                queue.offer(new int[] {nextX, nextY});

                check[nextY][nextX] = map[now[1]][now[0]] + 1;
            }
        }
    }

}
