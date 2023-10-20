
import java.io.*;

public class Main{

    public static boolean consecutiveCheck(String input){
        // a e i o u 유무 체크
        if (!input.matches(".*[aeiou].*") ||
                input.matches(".*([^eo])\\1.*") ||
                input.matches(".*([aeiou]{3}|[^aeiou]{3}).*"))
            return false;
        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input="";

        while (!(input = br.readLine()).equals("end")){;
            if(consecutiveCheck(input)){
                System.out.printf("<%s> is acceptable.\n", input);
            }else{
                System.out.printf("<%s> is not acceptable.\n",input);
            }
        }
    }
}