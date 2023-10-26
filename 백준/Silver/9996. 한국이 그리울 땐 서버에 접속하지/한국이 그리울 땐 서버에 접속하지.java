import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseCount = Integer.parseInt(br.readLine());
        String caseIf = br.readLine();

        String[] parts = caseIf.split("\\*");
        String preStar = parts[0];
        String postStar = parts[1];

        String regex = "^" + preStar + "[a-z]*" + postStar + "$";

        for(int i = 0; i < caseCount; i++){
            String question = br.readLine();
            if(question.matches(regex)){
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}