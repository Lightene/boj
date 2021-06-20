package 단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 11047
public class q11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split(" ");

        int N = Integer.parseInt(input[0]);

        int K = Integer.parseInt(input[1]);

        int result = 0;

        ArrayList<Integer> coin = new ArrayList<>();

        for (int i = 0; i < N; i++)
        {
            coin.add(Integer.parseInt(bf.readLine()));
        }

        for (int i = N-1; i >= 0; i--){
            int temp = K / coin.get(i) > 0 ?  K / coin.get(i) : 0;
            System.out.println(temp);
            if(temp > 0){
                result += temp;
                K -= temp * coin.get(i);
            }
        }
        
        System.out.println(result);

    }

}
