import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(br.readLine());
        int[] caseResult = new int[caseCount];

        for(int i = 0; i < caseCount; i++){
            int costumeCount = Integer.parseInt(br.readLine());

            HashMap<String, List<String>> costume = new HashMap<>();

            for(int j = 0; j < costumeCount; j++){
                String[] costumeTemp = br.readLine().split(" ");
                List<String> checkCostume = new ArrayList<>();
                if(costume.containsKey(costumeTemp[1])){
                    checkCostume = costume.get(costumeTemp[1]);
                }
                checkCostume.add(costumeTemp[0]);
                costume.put(costumeTemp[1], checkCostume);
            }
            int costumeCountTemp = 1;
            for(String key : costume.keySet()){
                costumeCountTemp *= costume.get(key).size() + 1;
            }

            caseResult[i] = costumeCountTemp-1;

        }
        
        for(int i = 0; i < caseResult.length; i++){
            System.out.println(caseResult[i]);
        }
    }
}