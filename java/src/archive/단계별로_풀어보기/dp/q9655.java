package archive.단계별로_풀어보기.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q9655 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        if(N%2 == 0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }

    }
}

