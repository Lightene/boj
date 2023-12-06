import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int documentNum = Integer.parseInt(st.nextToken());
            int printNum = Integer.parseInt(st.nextToken());

            Integer[] importNum = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

            Queue<int[]> q = new ArrayDeque<>();


            for(int j = 0; j < importNum.length; j++){
                q.offer(new int[]{j, importNum[j]}); // [ 순서, 중요도 ]
            }

            Arrays.sort(importNum, Collections.reverseOrder());

            // 시작점 찾기
            while (!q.isEmpty() && q.peek()[1] != importNum[0]){
                int[] temp = q.poll();
                q.offer(temp);
            }

            int result = 0;

            while (!q.isEmpty()){

                int[] temp = q.poll();
                if(importNum[result] == temp[1]){
                    ++result;
                    if(temp[0] == printNum){
                        break;
                    }
                }else{
                    q.offer(temp);
                }
            }

            System.out.println(result);
        }

    }
}