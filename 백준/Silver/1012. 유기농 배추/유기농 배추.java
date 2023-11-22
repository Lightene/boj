import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){ // 테스트 케이스 수 만큼 반복

            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken()); // 배추의 수

            // 선언 및 초기화
            int[][] table = new int[height][width];
            boolean[][] boolTable = new boolean[height][width];

            Queue<int[]> q = new ArrayDeque<>();

            for(int countK = 0; countK < K; countK++){
                st = new StringTokenizer(br.readLine(), " ");
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                table[Y][X] = 1;
            }

            int[] XSearch = { 1, 0, -1, 0};
            int[] YSearch = { 0, 1, 0, -1};

            int caseResult = 0;

            for(int h = 0; h < height; h++){
                for (int w = 0; w < width; w++){
                    if(table[h][w] == 1 && !boolTable[h][w]){
                        q.add(new int[]{h, w});
                        boolTable[h][w] = true;

                        while (!q.isEmpty()){
                            int[] poll = q.poll();

                            for(int s = 0; s < 4; s++){
                                if(0 <= poll[0] + YSearch[s] && height > poll[0] + YSearch[s] &&
                                   0 <= poll[1] + XSearch[s] && width > poll[1] + XSearch[s] &&
                                        !boolTable[poll[0] + YSearch[s]][poll[1] + XSearch[s]] &&
                                        table[poll[0] + YSearch[s]][poll[1] + XSearch[s]] == 1
                                   ){
                                    boolTable[poll[0] + YSearch[s]][poll[1] + XSearch[s]] = true;
                                    q.add(new int[]{ poll[0] + YSearch[s], poll[1] + XSearch[s]});
                                }
                            }

                        }
                        ++caseResult;
                    }
                }
            }
            System.out.println(caseResult);
        }
    }
}