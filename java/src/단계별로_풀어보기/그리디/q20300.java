package 단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class q20300 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        ArrayList<Long> M = new ArrayList<Long>();

        long result = 0;

        for(String str: bf.readLine().split(" ")){
            M.add(Long.parseLong(str));
        }

        Collections.sort(M);

        if(N % 2 != 0){
            N--;
            result = M.get(N-1);
        }

        for(int i = 0; i < N / 2; i ++){
            result = Math.max(result, M.get(i) + M.get(N - i - 1));
        }

        System.out.println(result);
    }
}
