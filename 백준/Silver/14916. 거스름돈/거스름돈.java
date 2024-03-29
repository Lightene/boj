import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static int money(int input, int five){
        int current = input - (five*5);
        if(five == 0 && current % 2 != 0)
            return -1;
        if(current % 2 == 0){
            return five+(current / 2);
        }
        return money(input, five-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();

        int input = Integer.parseInt(line);

        System.out.println(money(input,input/5));
    }
}