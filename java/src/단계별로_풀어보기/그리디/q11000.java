package 단계별로_풀어보기.그리디;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class q11000 {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static int[][] timeTable;

    public static void classRoom(int N) throws IOException {
        if(N < 0) return;

        String[] ST = bf.readLine().split(" ");
        int S = Integer.parseInt(ST[0]);
        int T = Integer.parseInt(ST[1]);

        timeTable[N][0] = S;
        timeTable[N][1] = T;

        classRoom(N-1);
    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bf.readLine());

        timeTable = new int[N][2];

        classRoom(N-1);

        Arrays.sort(timeTable,(o1, o2)->{
            if(o1[0] == o2[0]) return Integer.compare(o1[1],o2[1]);
            else return Integer.compare(o1[0],o2[0]);
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(timeTable[0][1]);

        for(int i = 1; i < N; i++){
            if(pq.peek() <= timeTable[i][0]) pq.poll();
            pq.add(timeTable[i][1]);
        }

//        System.out.println(Arrays.deepToString(timeTable));
        System.out.println(pq.size());
    }
}
