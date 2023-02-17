package archive.단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class q11399 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int result = 0, temp = 0;

        ArrayList<Integer> P = new ArrayList<Integer>();

        for(String a : bf.readLine().split(" ")){
            P.add(Integer.parseInt(a));
        }

        Collections.sort(P);

        for(int i : P){
            temp += i;
            result += temp;
        }

        System.out.println(result);

    }
}
