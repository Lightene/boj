import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        double result = 0d;

        ArrayList<Integer> drink = new ArrayList<Integer>();

        for(String a : bf.readLine().split(" ")){
            drink.add(Integer.parseInt(a));
        }

        Collections.sort(drink, Collections.reverseOrder());

        result += drink.get(0);

        for(int i = 1; i < N; i++){
            result += (float)drink.get(i)/2;
        }

        System.out.println(result);

    }
}
