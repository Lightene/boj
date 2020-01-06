// 1065 - 한수

package 단계별로_풀어보기.함수;

import java.util.Scanner;

public class q1065 {

    public static int one(int[] lst) {
        int chk = lst[0] - lst[1];
        int chk2 = lst[1] - lst[2];

        return chk == chk2 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 100) {
            System.out.println(num);
        } else {
            int count = 99;

            for (int i = 100; i <= num; i++) {
                int[] lst = new int[3];
                int value = i;

                lst[0] = value / 100;
                value %= 100;
                lst[1] = value / 10;
                lst[2] = value % 10;

                count += one(lst);
            }

            System.out.println(count);
        }


    }

}
