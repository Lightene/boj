package 단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q2217 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        int idx = Integer.parseInt(line);

        int[] input = new int[idx];

        String l = "";

        for(int i = 0; i < idx; i++){
            l  = bf.readLine();
            input[i] = Integer.parseInt(l);
        }

        Arrays.sort(input);

        for(int i = idx-1; i >= 0; i--){
            input[i] = input[i] * (idx - i);
        }

        Arrays.sort(input);

        System.out.println(input[idx-1]);

    }
}
