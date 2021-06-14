package 단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q2212 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int K = Integer.parseInt(bf.readLine())-1;

        HashSet<String> set = new HashSet<>();  
        List<Integer> list = new ArrayList<>(); 
        List<Integer> result = new ArrayList<>();
        
        set.addAll(Arrays.asList(bf.readLine().split(" ")));
        
        for(String s : set){
            list.add(Integer.parseInt(s));
        }
        
        Collections.sort(list, Collections.reverseOrder());

        int temp = list.get(0);

        System.out.println(list.size());
        
        for(int i = 1; i < list.size(); i++){
            int listi = list.get(i);
            result.add(temp - listi);
            temp = listi;
        }
               
        Collections.sort(result,Collections.reverseOrder());

        
        for(int i = 0; i < K; i++){
            if (result.size() > 0) result.remove(0);
        }
        
        int iresult = 0;

        for (int i : result){
            iresult += i;
        }

        System.out.println(iresult);
    }
}
