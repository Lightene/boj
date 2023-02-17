
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        int nSize = Integer.parseInt(input.split(" ")[0]);

        ArrayList<int[]> table = new ArrayList<>();

        for(int i = 0; i < nSize; i++)
        {
            input = bf.readLine();
            int first = Integer.parseInt( input.split(" ")[0]);
            int third = Integer.parseInt( input.split(" ")[1]);

            table.add(new int[]{first, third});
        }

        table.sort(Comparator.comparingInt(o -> o[0]));

        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.offer(table.get(0)[1]);

        int cnt = 1;
        for(int i = 1; i < nSize; i++){
            while (!q.isEmpty() && q.peek() <= table.get(i)[0]){
                q.poll();
            }
            q.offer(table.get(i)[1]);
            cnt = Math.max(cnt, q.size());
        }

        System.out.println(cnt);
    }
}