import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] index = new int[31];
        
        for(int i = 0; i < 28; i++){
            index[Integer.parseInt(br.readLine())] = 1;
        }
        
        for(int i = 1; i < 31; i++){
            if(index[i] != 1) System.out.println(i);
        }
        
    }
}