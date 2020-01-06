package 단계별로_풀어보기.분할정복;// 2748 - 피보나치 수 3

import java.util.Scanner;

public class q2748 {

    public static long fibo3(long[] arr){
        int length = arr.length;
        for(int i = 2; i < length; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[length-1];
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();

        long[] arr = new long[idx + 1];

        arr[0] = 0;
        arr[1] = 1;

        System.out.println(fibo3(arr));
    }
}
