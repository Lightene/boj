package 단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q21314 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] MK = bf.readLine().split("");

        int mCnt = 0;

        // 최대 값을 구하는 연산
        for (int i = 0; i < MK.length; i++) {
            if (MK[i].equals("K")) {
                System.out.print("5");
                for (int j = mCnt; j > 0; j--) {
                    System.out.print("0");
                }
                mCnt = 0;
                continue;
            }
            ++mCnt;
        }
        if (0 < mCnt) {
            System.out.print("1");
            for (int i = mCnt; i > 1; i--) {
                System.out.print("0");
            }
        }
        System.out.println();

        // 최소 값을 구하는 연산
        mCnt = -1;

        for (int i = 0; i < MK.length; i++) {
            if (MK[i].equals("K")) {
                if (mCnt > -1) {
                    System.out.print("1");
                    for (int j = mCnt; j > 0; j--) {
                        System.out.print("0");
                    }
                }
                mCnt = -1;
                System.out.print("5");
            } else {
                ++mCnt;
            }
        }

        if (mCnt > -1) {
            System.out.print("1");
            for (int j = mCnt; j > 0; j--) {
                System.out.print("0");
            }
        }
    }
}

