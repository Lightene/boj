import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        if(N > 0){
            list.addAll(Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
        }
        list.add(num);
        Collections.sort(list, Collections.reverseOrder());

        int idx = list.indexOf(num); // rank
        int lastidx = list.lastIndexOf(num);

        if(lastidx >= P){
            System.out.println(-1);
        } else {
            System.out.println(idx+1);
        }
    }
}