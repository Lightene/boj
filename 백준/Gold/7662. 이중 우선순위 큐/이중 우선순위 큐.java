import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());

        for(int testCaseCount = cases; testCaseCount > 0; testCaseCount--){
            int tcCount = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> map = new TreeMap<>();

            for(int tc = 0; tc < tcCount; tc++){
                String[] input = br.readLine().split(" ");
                int n = Integer.parseInt(input[1]);
                if(input[0].equals("I")){
                    map.put(n, map.getOrDefault(n, 0)+1);
                }else{
                    if(map.isEmpty()) continue;

                    if(input[1].equals("1")) {
                        if(map.get(map.lastKey()) == 1){
                            map.pollLastEntry();
                        }else{
                            map.put(map.lastKey(), map.get(map.lastKey()) -1);
                        }
                    }else{
                        if(map.get(map.firstKey()) == 1){
                            map.pollFirstEntry();
                        }else{
                            map.put(map.firstKey(), map.get(map.firstKey()) -1);
                        }
                    }
                }
            }

            if(map.isEmpty()){
                System.out.println("EMPTY");
            }else{
                System.out.printf("%d %d \n", map.lastKey(), map.firstKey());
            }
        }

    }
}