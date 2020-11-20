package 단계별로_풀어보기.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        String[] input = bf.readLine().split("");

//        if(N != input.length){}
        
        int result = 0;

        for(String sub: input){
            result += Integer.parseInt(sub);
        }

        System.out.println(result);

    }
}
