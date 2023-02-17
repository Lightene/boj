package archive.백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class q4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            ArrayDeque<Character> temp = new ArrayDeque<>();

            String input = br.readLine();

            if (input.equals(".")) return;

            for (char character : input.toCharArray()) {

                if(character == '(' || character == '['){
                    temp.push(character);
                    continue;
                }

                if(temp.isEmpty() && (character == ')' || character == ']')){
                    temp.push(character);
                    break;
                }

                if(!temp.isEmpty() && character == ')'){
                    if(temp.peek() == '('){
                        temp.pop();
                        continue;
                    }
                    break;
                }

                if(!temp.isEmpty() && character == ']'){
                    if(temp.peek() == '['){
                        temp.pop();
                        continue;
                    }
                    break;
                }
            }

            if (temp.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}