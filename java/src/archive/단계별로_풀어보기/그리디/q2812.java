package archive.단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q2812 {
    public static void main(String[] args) throws IOException {

        long st = System.currentTimeMillis();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] str = bf.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        String number = bf.readLine();


        Stack<Integer> stack = new Stack<>();



        long end = System.currentTimeMillis();
        System.out.println( "실행 시간 : " + ( end - st )/1000.0 );
    };

}
