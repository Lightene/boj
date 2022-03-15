package 단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class q13164 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        int N = Integer.parseInt(input.split(" ")[0]);
        int K = Integer.parseInt(input.split(" ")[1]);
        ArrayList<Integer> nIdx = new ArrayList<Integer>();
        int result = 0;

        ArrayList<Integer> student = new ArrayList<Integer>();
        for(String nX : bf.readLine().split(" ")){
            student.add(Integer.parseInt(nX));
        }

        for(int i = 0; i < N-1; i++)
        {
            nIdx.add(student.get(i+1) - student.get(i));
        }

        Collections.sort(nIdx);

        for(int idx : nIdx.subList(0, N-K)){
            result += idx;
        }

        System.out.println(result);

    }
}
