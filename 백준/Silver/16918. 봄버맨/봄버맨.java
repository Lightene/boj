import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int[] vX = {0, 1, 0, -1};
    static int[] vY = {1, 0, -1, 0};

    static String[][] map;

    static int height, width, sec;

    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        height = Integer.parseInt(input[0]);
        width = Integer.parseInt(input[1]);
        sec = Integer.parseInt(input[2]);

        map = new String[height][width];

        for(int i = 0; i < height; i++)
        {
            map[i] = br.readLine().split("");
        }

        // --------------------------------------------------------------------

        if(sec % 2 != 0){
            for(int time = 3; time <= sec; time+=2){
                for(int h = 0; h < height; h++){
                    for (int w = 0; w < width; w++){
                        if(map[h][w].equals("O")){
                            q.offer(new int[]{h, w});
                        }
                    }
                }
                bombInitialize();
                bfs();
            }
        }else{
            bombInitialize();
        }

        for(int h = 0; h < height; h++){
            for (int w = 0; w < width; w++){
                System.out.printf("%s",map[h][w]);
            }
            System.out.println();
        }
    }
    static void bombInitialize(){
        for(int h = 0; h < height; h++){
            for (int w = 0; w < width; w++){
                map[h][w] = "O";
            }
        }
    }
    static void bfs(){
        while (!q.isEmpty()){
            int[] vector = q.poll();

            map[vector[0]][vector[1]] = ".";

            for(int i = 0; i < 4; i++){

                int cX = vector[1] + vX[i];
                int cY = vector[0] + vY[i];

                if(cX >= 0 && cX < width && cY >= 0 && cY < height)
                {
                    map[cY][cX] = ".";
                }
            }
        }
    }
}
