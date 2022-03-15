package 단계별로_풀어보기.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q17626 {
    static int[] sq = new int[234];

    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int MAX = 224; // 50,000의 제곱값 근사치가 223임
        int[] arr = new int [MAX];

        for(int i = 1; i < MAX; i++){
            arr[i] = i*i;
        }

        for(int i = 1; i < 234; i++){
            sq[i] = i * i;
        }


    }

    public static void fx(){

    }
}