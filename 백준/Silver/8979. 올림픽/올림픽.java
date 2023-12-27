import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray());
        }

        Collections.sort(list, (o1, o2) -> {
            if (o1[1] != o2[1]) {
                return o1[1] - o2[1];
            }

            if (o1[2] != o2[2]) {
                return o1[2] - o2[2];
            }

            return o1[3] - o2[3];
        });

        int rank = 1;

        for (int i = 0; i < N - 1; i++) {
            int[] current = list.get(i);
            int[] next = list.get(i + 1);

            if(current[0] == K){
                System.out.println(rank);
                return;
            }

            if (!(current[1] == next[1] &&
                    current[2] == next[2] &&
                    current[3] == next[3]) ) {
                ++rank;
            }
        }

    }
}
