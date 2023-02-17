package archive.단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class q1931 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= N; i++)
        {
            String input = bf.readLine();
            int toA = Integer.parseInt(input.split(" ")[0]);
            int toB = Integer.parseInt(input.split(" ")[1]);

            map.put(toA, toB);
        }

        for(int a : map.keySet()){
            System.out.println(a);
        }
        
    }
}
