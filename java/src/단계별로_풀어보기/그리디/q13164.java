package 단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class q13164 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int K = Integer.parseInt(input.split(" ")[1]);

        int partition = N % K;
        int range = N / K;
        int temp = 0;
        int result = 0;

        ArrayList<Integer> student = new ArrayList<Integer>();
        for(String Nx : bf.readLine().split(" ")){
            student.add(Integer.parseInt(Nx));
        }

        for(int i = 0; i < range; i++){
            result += student.get(temp) - student.get(partition - 1);
            temp = partition + 1;
            partition *= 2;
        }


        for(int i = range * K; i < N; i++){
            result += student.get(i);
        }

        System.out.println(result);



    }
}
