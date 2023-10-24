import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 1; i <= input; i++){
            int count = 0;
            for(int j = i; j <= input; j++){
                count += j;
                if(count > input){
                    break;
                }
                if (count == input){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}