import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < count; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        Set<Integer> set = new HashSet<>(arr);
        set.add(-1);

        int prev = 0;

        for(int item : set){
            List<Integer> list = arr.stream().filter(f -> f != item).collect(Collectors.toList());
            int max = 0;
            int cur_max = 1;
            for(int i = 0; i < list.size()-1; i++){
                if(list.get(i).equals(list.get(i+1))){
                    ++cur_max;
                }else{
                    max = Math.max(max, cur_max);
                    cur_max = 1;
                }
            }
            max = Math.max(max, cur_max);
            prev = Math.max(max, prev);
        }

        System.out.println(prev);

    }
}