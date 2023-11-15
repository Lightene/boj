import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int X = Integer.parseInt(st.nextToken()), Y = Integer.parseInt(st.nextToken()), Z = Integer.parseInt(st.nextToken());

        int[][][] tomato = new int[Z][Y][X];

        Queue<int[]> q = new ArrayDeque<>();

        for(int i = 0; i < Z; i++) // Z
        {
            for(int j = 0; j < Y; j++) // Y
            {
                tomato[i][j] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
        }

        for(int i = 0; i < Z; i++){
            for(int j = 0; j < Y; j++){
                for(int k = 0; k < X; k++){
                    if(tomato[i][j][k] == 1) q.add(new int[]{i, j, k});
                }
            }
        }

        int[] x = {1, 0, -1, 0},
              y = {0, 1, 0, -1},
              z = {1, -1};

        int result = -1;

        while (!q.isEmpty()){
            ++result;

            for(int qRound = q.size(); qRound > 0; --qRound){
                int[] position = q.poll();
                int positionX = position[2];
                int positionY = position[1];
                int positionZ = position[0];


                for(int i = 0; i < 2; i++){ // 층 단위
                    if(positionZ + z[i] >= 0 && positionZ + z[i] < Z &&
                            tomato[positionZ+z[i]][positionY][positionX] == 0){
                        tomato[positionZ+z[i]][positionY][positionX] = 1;
                        q.add(new int[]{positionZ+z[i], positionY, positionX});
                    }
                }

                for(int i = 0; i < 4; i++){ // 2차원
                    if(positionY + y[i] >= 0 && positionY + y[i] < Y &&
                            positionX + x[i] >= 0 && positionX + x[i] < X &&
                            tomato[positionZ][positionY + y[i]][positionX + x[i]] == 0){
                        tomato[positionZ][positionY + y[i]][positionX + x[i]] = 1;
                        q.add(new int[]{positionZ, positionY + y[i], positionX + x[i]});
                    }
                }
            }
        }

        for(int[][] ZZ : tomato){
            for(int[] YY : ZZ){
                for(int XX : YY){
                    if(XX == 0) result = -1;
                }
            }
        }

        System.out.println(result);
    }
}