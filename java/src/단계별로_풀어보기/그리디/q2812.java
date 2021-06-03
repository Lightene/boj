package 단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q2812 {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] str = bf.readLine().split(" ");
//        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        int[] num =  Arrays.stream(bf.readLine().split("")).mapToInt(Integer::parseInt).toArray();


        List<Integer> list = new ArrayList<>();
        list.add(num[0]);

        for(int i = 1; i < num.length; i++)
        {
            if(K < 0) break;
            for(int j = i; j < num.length; j++){
                int idx = list.size()-1;
                if(!list.isEmpty() && num[i] > list.get(idx)){
                    list.remove(idx);
                    K--;
                    break;
                }
            }
            list.add(num[i]);
        }

        for(int s: list){
            System.out.print(s);
        }

        long end = System.currentTimeMillis();
        System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
    };

}
