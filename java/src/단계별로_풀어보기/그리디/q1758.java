package 단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class q1758 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        Integer[] arr = new Integer[500];

        int result = 0;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));

        for(int i = 0; i < N; i++){
            int tip = arr[i] - i;
            if(tip > 0){
                result += tip;
            }
        }

        System.out.println(result);
    }
}
