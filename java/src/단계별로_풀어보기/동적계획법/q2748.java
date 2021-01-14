package 단계별로_풀어보기.동적계획법;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수2
public class q2748 {

    public static void fibo(int fn){
        long first= 0, end=1, temp = 0;
        if(fn == first) System.out.println(first);
        else if(fn == end) System.out.println(end);
        else {
            for (int i = 2; i <= fn; i++) {
                temp = first + end;
                first = end;
                end = temp;
            }
            System.out.println(end);
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bf.readLine());

        fibo(input);
    }
}
