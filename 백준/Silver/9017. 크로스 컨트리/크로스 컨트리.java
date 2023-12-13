import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++)
        {
            int rankNum = Integer.parseInt(br.readLine());
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            String seqStr = br.readLine();
            List<Integer> seq = Arrays.stream(seqStr.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

            HashSet<Integer> teams = new HashSet<>(seq);

            for(int team : teams){
                if(6 == Arrays.stream(seqStr.split(" ")).filter(c -> c.equals(String.valueOf(team))).count()){
                    map.put(team, new ArrayList<>());
                }
            }


            int minus = 0;
            for(int rank = 0; rank < rankNum; rank++){
                if(map.containsKey(seq.get(rank))){
                    map.get(seq.get(rank)).add((rank+1)-minus);
                }else{
                    ++minus;
                }
            }

            int under = Integer.MAX_VALUE;
            int current = 0;
            for(int key : map.keySet()){
                int sum = map.get(key).stream().limit(4).reduce(0, Integer::sum);

                if(under > sum){
                    under = sum;
                    current = key;
                    continue;
                }

                if (under == sum){
                    for(int compare = 4; compare < 6; compare++){

                        if(map.get(key).get(compare) != map.get(current).get(compare)){
                            under = map.get(key).get(compare) > map.get(current).get(compare) ? under : sum;
                            current = map.get(key).get(compare) > map.get(current).get(compare) ? current : key;
                            break;
                        }
                    }
                }
            }
            System.out.println(current);
        }
    }
}