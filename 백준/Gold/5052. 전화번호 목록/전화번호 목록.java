import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseCount = Integer.parseInt(br.readLine());

        while ((--caseCount) >= 0){
            int subCaseCount = Integer.parseInt(br.readLine());

            List<String> caseItem = new ArrayList<>();

            while ((--subCaseCount) >= 0){
                caseItem.add(br.readLine());
            }

            caseItem.sort(Comparator.naturalOrder());

            boolean caseBreak = false;

            for(int i = 0; i < caseItem.size()-1; i++){
                if(caseItem.get(i+1).startsWith(caseItem.get(i))){
                    System.out.println("NO");
                    caseBreak = true;
                    break;
                }
            }
            if(!caseBreak){
                System.out.println("YES");
            }
        }
    }
}