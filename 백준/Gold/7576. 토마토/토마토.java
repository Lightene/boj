

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

        static int height, width;

        static int[][] map;

        static int[] vectorX = {0,1,0,-1};
        static int[] vectorY = {1,0,-1,0};

        static Queue<int[]> q = new LinkedList<>();

        static int sec = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        width = Integer.parseInt(input[0]);
        height = Integer.parseInt(input[1]);

        map = new int[height][width];

        for(int i = 0; i < height; i++){
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for(int h = 0; h < height; h++){
            for(int w = 0; w < width; w++){
                if(map[h][w] == 1){
                    q.offer(new int[]{h, w});
                }
            }
        }

        while (!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int[] vector = q.poll();
                bfs(vector[0],vector[1]);
            }

            sec++;
        }

        boolean fail = false;

        for(int h = 0; h < height; h++){
            for(int w = 0; w < width; w++){
                if(map[h][w] == 0){
                    fail = true;
                    break;
                }
            }
        }

        if(fail){
            System.out.println(-1);
        }else {
            System.out.println(sec-1);
        }

    }

    static void bfs(int y, int x) {

        for(int i = 0; i < 4; i++)
        {
            int cX = x + vectorX[i];
            int cY = y + vectorY[i];

            if(cX > -1 && cX < width && cY > -1 && cY < height && map[cY][cX] == 0){
                map[cY][cX] = 1;
                q.offer(new int[]{cY, cX});
            }
        }
    }
}
