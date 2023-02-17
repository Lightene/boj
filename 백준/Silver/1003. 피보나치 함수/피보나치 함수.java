import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bf.readLine());

        int size = 42;
        int []arr = new int[size];
        arr[0] = 1;
        arr[1] = 0;
        for(int i = 2; i < size; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        while(input-- > 0){
            int select = Integer.parseInt(bf.readLine());
            System.out.println(arr[select] + " " + arr[select+1]);
        }
    }
}
