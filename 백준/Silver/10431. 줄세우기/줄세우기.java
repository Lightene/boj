import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for(int i = 1; i <= testcase; i++)
        {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int caseNumber = arr[0];

            arr = Arrays.copyOfRange(arr, 1, arr.length);

            int repeat = 0;
            boolean running = true;
            while (running) {
                running = false;
                for (int root = 0; root < 19; root++) {
                    if (arr[root] < arr[root+1]) continue;
                    else { // 같은 키는 없다!
                        ++repeat;
                        int temp = arr[root];
                        arr[root] = arr[root+1];
                        arr[root+1] = temp;
                        running = true;
                    }
                }
            }
            System.out.println(caseNumber+ " "+ repeat);
        }


    }
}
