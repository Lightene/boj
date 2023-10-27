import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer bf = new StringBuffer();

        int count = Integer.parseInt(br.readLine());

        int[] trophy = new int[count];

        int max, look;

        max = look = 0;

        for(int i = 0; i < count; i++){
            trophy[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i <= count-1; i++){
            if(max < trophy[i]){
                max = trophy[i];
                look++;
            }
        }

        System.out.println(look);

        max = look = 0;

        for(int i = count-1; i >= 0; i--){
            if(max < trophy[i]){
                max = trophy[i];
                look++;
            }
        }
        System.out.print(look);
    }
}