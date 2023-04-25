import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(char ch : br.readLine().toCharArray()){
            if(ch >= 65 && ch <= 90){
                System.out.printf("%c", ch+32);
            }
            if(ch >= 97 && ch <= 122){
                System.out.printf("%c", ch-32);
            }
        }
    }
}