

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {

    static int width, height;

    static int[] vectorX= {-1,0,1,0};
    static int[] vectorY= {0,-1,0,1};

    static ArrayDeque<int[]> q;

    static String[][] map;

    static boolean fail;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        q = new ArrayDeque<>();

        height = Integer.parseInt(input[0]);
        width = Integer.parseInt(input[1]);

        map = new String[height][width];

        fail = false;

        for(int i = 0; i < height; i++)
        {
            map[i] = br.readLine().split("");
        }

        for(int i = 0; i< height; i++)
        {
            for(int j = 0; j< width; j++)
            {
                if(map[i][j].equals("W")){
                    q.add(new int[]{i, j});
                }
            }
        }

        for(int i = 0; i < q.size(); i++)
        {
            if(fail) break;

            int[] v = q.poll();

            for(int e = 0; e < 4; e++){
                int x = v[1] + vectorX[e];
                int y = v[0] + vectorY[e];

                if(x >= 0 && y >= 0 && x < width && y < height){
                    if(map[y][x].equals("S")){
                        fail = true;
                    }
                }

            }
        }

        if(fail){
            System.out.println(0);
        }else{
            System.out.println(1);
            for(int i = 0; i < height; i++){
                for (int j = 0; j < width; j++){
                    if(map[i][j].equals(".")) System.out.print("D");
                    else System.out.print(map[i][j]);
                }
                System.out.println();
            }
        }
    }

}
