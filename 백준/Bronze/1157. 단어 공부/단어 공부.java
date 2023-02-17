import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];
        char[] strToChar = bf.readLine().toUpperCase().toCharArray();

        char result_char = '?';
        int result_cnt = 0;
        for(char ch : strToChar){
            alpha[ch-65]++;
            if(result_cnt < alpha[ch-65]){
                result_char = ch;
                result_cnt = alpha[ch-65];
            }
            else if(result_cnt == alpha[ch-65]){
                result_char = '?';
            }
        }
        System.out.println(result_char);

    }
}
