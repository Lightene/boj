// 10870 - 피보나치수 5

import java.util.Scanner;

public class q10870 {
    static int fi(int idx, int []list){
        return list[idx-1]+list[idx-2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[21]; // N+1 로 하면 런타임 에러가 나옴

        list[0] = 0;
        list[1] = 1;

        for(int i =2; i <= N; i++){
            list[i]=fi(i, list);
            System.out.println(i+"인덱스 "+list[i]);
        }

        System.out.println(list[N]);
    }
}
