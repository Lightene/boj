package archive.단계별로_풀어보기.그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q1260 {

    static int[][] node;
    static int[] check;

    // 정점 개수, 간선 수, 탐색 시작 번호
    static int N, M, V;

    static void dfs(int start) {
        check[start] = 1;
        System.out.print(start + " ");
        for (int i = 1; i < N+1; i++) {
            if (i != start && node[start][i] == 1 && check[i] == 0) {
                dfs(i);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        while (!q.isEmpty()) {
            start = q.poll();
            check[start] = 1;
            System.out.print(start + " ");

            for (int i = 1; i < N+1; i++) {
                if (node[start][i] == 1 && check[i] == 0) {
                    q.offer(i);
                    check[i] = 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        node = new int[N + 1][N + 1];
        check = new int[N + 1];

        for (int i = 0; i < M; i++) {
            int[] xy = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            node[xy[0]][xy[1]] = node[xy[1]][xy[0]] = 1;
        }

        dfs(V);
        System.out.println();
        check = new int[N + 1];
        bfs(V);
    }
}
