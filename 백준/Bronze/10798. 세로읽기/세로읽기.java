import java.util.*;
import java.io.*;

class Main{
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] question = new String[5][15];

        for(int i = 0; i < 5; i++){
            question[i] = br.readLine().split("");
        }

        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                if(question[j].length - 1 < i ) continue;
                if(!question[j][i].isEmpty()){
                    System.out.print(question[j][i]);
                }
            }
        }
    }
}