import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        
        if(input % 4 == 0 && (input % 400 == 0 || input % 100 != 0)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}