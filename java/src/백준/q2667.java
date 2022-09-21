package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q2667 {

    // N 입력 받을 값
    // temp  dfs 돌며 단지의 수를 저장할 임시 변수
    static int N, temp;

    static int[] vectorX = {1,0,-1,0};
    static int[] vectorY = {0,-1,0,1};

    // 맵 입력 받는다
    static int [][]map;

    // 방문 여부를 체크한다
    static int [][]check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정사각형이므로 맵의 크기는 하나만 받는다
        N = Integer.parseInt(br.readLine());

        map = new int [N][N];
        check = new int [N][N];

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < N; i++)
        {
            map[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        }

        // i = y축
        // j = x축
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(check[i][j] == 0 && map[i][j] == 1){
                    temp = 0;
                    dfs(j,i);
                    result.add(temp);
                }
            }
        }

        result.sort(Integer::compareTo);

        System.out.println(result.size());
        for (int i : result){
            System.out.println(i);
        }
    }

    static void dfs(int cX, int cY){
        check[cY][cX] = 1;
        temp++;

        for(int i = 0; i < 4; i++)
        {
            int nX = cX+vectorX[i];
            int nY = cY+vectorY[i];

            if(nX >= N || nX < 0 || nY >= N || nY < 0){
                continue;
            }

            if(map[nY][nX] == 1 && check[nY][nX] == 0){
                dfs(nX, nY);
            }
        }
    }
}
