import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());
        int[] cases = new int[testcase];
        for (int i = 0; i < testcase; i++)
        {
            cases[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        ArrayList<String> str = new ArrayList<>();

        int casesRepeat = 0;

        for(int i = 1; i <= testcase; i++){
            stack.push(i);
            str.add("+");

            while (!stack.isEmpty() && stack.peek() == cases[casesRepeat]){
                casesRepeat++;
                stack.pop();
                str.add("-");
            }
        }

        if(stack.isEmpty()){
            for (String s : str) System.out.println(s);
        }else {
            System.out.println("NO");
        }
    }
}
