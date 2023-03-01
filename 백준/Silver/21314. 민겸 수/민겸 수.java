import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] examInput = bufferedReader.readLine().split("");

        System.out.println(maximumResult(examInput));
        System.out.println(minimumResult(examInput));

    }

    public static String maximumResult(String[] exam){
        int M = -1;
        StringBuilder stringBuilder = new StringBuilder();
        for (String item: exam){
            if(item.equals("M")) M++;
            if(item.equals("K")){
                stringBuilder.append("5");
                for(int i = -1; i < M; i++){
                    stringBuilder.append(0);
                }
                M = -1;
            }
        }
        for(int i = -1; i < M; i++)
        {
            stringBuilder.append(1);
        }
        return stringBuilder.toString();
    }

    public static String minimumResult(String[] exam){
        int M = -1;
        StringBuilder stringBuilder = new StringBuilder();
        for(String item: exam){
            if(item.equals("M")) M++;
            if(item.equals("K")){
                if(M > -1){
                    stringBuilder.append(1);
                    for (int i = 0; i < M; i++){
                        stringBuilder.append(0);
                    }
                }
                stringBuilder.append(5);
                M = -1;
            }
        }

        if(M > -1){
            stringBuilder.append(1);
            for (int i = 0; i < M; i++){
                stringBuilder.append(0);
            }
        }
        return stringBuilder.toString();
    }

}
