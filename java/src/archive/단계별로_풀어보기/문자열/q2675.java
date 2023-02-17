package archive.단계별로_풀어보기.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2675 {

    static void print(String[] str){
        for(int i = 2; i < str.length; i++){
            for(int j = 0; j < Integer.parseInt(str[0]); j++){
                System.out.print(str[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());


        for(int i = 0; i < N; i++) {
            String[] str = bf.readLine().split("");
            print(str);
        }
    }
}
