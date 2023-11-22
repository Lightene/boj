import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> array = new ArrayList<>();

        for(int i = 0; i < N; i++){
            array.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken())-1;
            int last = Integer.parseInt(st.nextToken())-1;

            array.get(first).add(last);
            array.get(last).add(first);
        }

        Queue<Integer> q = new ArrayDeque<>();
        boolean[] bTable = new boolean[N];

        int result = 0;
        for(int i = 0; i < N; i++){
            if(bTable[i]) continue;
            if(!array.get(i).isEmpty()){
                q.addAll(array.get(i));
            }
            while(!q.isEmpty()){
                int dir = q.poll();
                if(!bTable[dir]){
                    bTable[dir] = true;
                    q.addAll(array.get(dir));
                }
            }
            ++result;
        }
        System.out.println(result);
    }
}