import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < N; i++)
        {
            String[] arr = br.readLine().split(" ");
            list.add(new ArrayList<>(Arrays.stream(Arrays.copyOfRange(arr, 1, arr.length))
                    .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList())));
        }

        int result = 0;

        for(int i = 0; i < N; i++){
            HashSet<Integer> set = new HashSet<>();

            for(int j = 0; j < N; j++){
                if(i == j) continue;
                set.addAll(list.get(j));
            }

            if(set.size() == M){
                result = 1;
                break;
            }
        }

        System.out.println(result);

    }
}

