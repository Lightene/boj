package 단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class q20365 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String N = bf.readLine();

        String input = bf.readLine();

        ArrayList<String> B = new ArrayList<>(Arrays.asList(input.split("[^B]")));
        ArrayList<String> R = new ArrayList<>(Arrays.asList(input.split("[^R]")));

        B.removeAll(Collections.singleton(""));
        R.removeAll(Collections.singleton(""));

        if(B.size() == 0 || R.size() == 0){
            System.out.println(1);
        }
        else if(B.size() >= R.size()){
            System.out.println(R.size()+1);
        }else {
            System.out.println(B.size()+1);
        }
    }
}
