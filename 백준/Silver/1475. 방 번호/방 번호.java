import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNumber = br.readLine();

        int[] numberList = new int[10];

        for(int i = 0; i < 10; i++){
            int check = i;
            numberList[i] = (int) Arrays.stream(roomNumber.split("")).mapToInt(Integer::parseInt).filter(f -> f == check).count();
        }

        int max = (int)Math.ceil((double) (numberList[6] + numberList[9]) /2);

        for(int i = 0; i < 10; i++){
            if(i == 6 || i == 9) continue;
            max = Math.max(numberList[i], max);
        }

        System.out.println(max);

    }
}
