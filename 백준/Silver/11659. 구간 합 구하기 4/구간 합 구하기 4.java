import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if(N >= 2){
            for(int i = 1; i < N; i++){
                arr[i] = arr[i-1] + arr[i];
            }

            for(int i = 0; i < M; i++){
                st = new StringTokenizer(br.readLine(), " ");
                int first = Integer.parseInt(st.nextToken());
                int last = Integer.parseInt(st.nextToken());

                int result = first-1 >= 1 ? arr[last-1] - arr[first-2] : arr[last-1];

                System.out.println(Math.abs(result));
            }
        }else{
            for(int i = 0; i < M; i++){
                System.out.println(arr[0]);
            }
        }

    }
}