import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int remainder = N % 3;
        int S = N - remainder;

        int result = 0;

        Integer[] arr = new Integer[N];


        for(int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < S; i++){
            if((i+1) % 3 != 0)
                result += arr[i];
        }

        if(remainder > 0){
            for(int i = N-1; i >= (N-remainder); i--)
            {
                result += arr[i];
            }
        }

        System.out.println(result);
    }
}
