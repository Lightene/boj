package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class q1325 {

    // 입력 받은 노드 배치
    static List<Integer>[] pair;

    // 각 노드의 연결된 값 저장
    static int[] cnt;
    // 방문여부
    static int[] check;

    static void dfs(int start){
        for(int next: pair[start])
        {
            if(check[next] == 0){
                cnt[next]++;
                check[next] = 1;
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        check = new int[N+1];
        cnt = new int[N+1];
        pair = new ArrayList[N+1];

        for (int i = 1; i <= N; i++)
        {
            pair[i] = new ArrayList<Integer>();
        }

        for(int i = 1; i < M; i++)
        {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            pair[A].add(B);
        }


        for(int i = 1; i <= N; i++){
            check = new int[N+1];
            check[i] = 1;
            dfs(i);
        }

        int MAX = Arrays.stream(cnt).max().getAsInt();

        for(int i = 1; i <= N; i++){
            if(MAX == cnt[i]){
                System.out.print(i+" ");
            }
        }

    }
}