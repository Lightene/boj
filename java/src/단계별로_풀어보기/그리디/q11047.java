package 단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class q11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        ArrayList<Integer> coin = new ArrayList<>();

        for(int i = 0; i < N; i++)
        {
            coin.add(Integer.parseInt(bf.readLine()));
        }



    }
}
