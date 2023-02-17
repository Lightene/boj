package archive.단계별로_풀어보기.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split("");

        int arrChar[] = new int[26];

        for (int i = 0; i < arrChar.length; i++)
            arrChar[i] = -1;

        int count = 0;
        for (String arr : input) {
            int value = Integer.valueOf(arr.charAt(0)) - 97;
            if (arrChar[value] < 0) {
                arrChar[value] = count;
            }

            count++;
        }

        for (int arr : arrChar) {
            System.out.printf("%d ", arr);
        }
    }
}
