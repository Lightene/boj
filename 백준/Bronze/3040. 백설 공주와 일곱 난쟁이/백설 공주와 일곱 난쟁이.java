import java.util.stream.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for(int i = 0; i < 9; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = IntStream.of(arr).sum();

        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(i == j) continue;
                if(100 == (sum - (arr[i] + arr[j]))){
                    arr[i] = 0;
                    arr[j] = 0;
                    break;
                }
            }

            if (arr[i] < 1) break;
        }

        for (int i = 0; i < 9; i++)
        {
            if(arr[i] > 0){
                System.out.println(arr[i]);
            }
        }
    }
}

