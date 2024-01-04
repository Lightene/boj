import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            set.add(bf.readLine());
        }

        for (int i = 0; i < M; i++) {
            String input = bf.readLine();
            if (set.contains(input)) {
                list.add(input);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for (String str : list){
            System.out.println(str);
        }
    }
}
