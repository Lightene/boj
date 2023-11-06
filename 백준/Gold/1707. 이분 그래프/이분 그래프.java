import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken()); // 정점
            int E = Integer.parseInt(st.nextToken()); // 간선
            
            if(E == 1) {
                System.out.println("YES");
                continue;
            }
            
            List<Integer>[] graph = new ArrayList[V + 1];
            for (int j = 1; j <= V; j++) {
                graph[j] = new ArrayList<>();
            }

            for (int j = 0; j < E; j++) {
                st = new StringTokenizer(br.readLine()); // v != u
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph[u].add(v);
                graph[v].add(u);
            }

            int[] colors = new int[V + 1];
            Arrays.fill(colors, 0);

            boolean isBipartite = true;
            for (int j = 1; j <= V; j++) {
                if (colors[j] == 0) {
                    if (!bfs(j, graph, colors)) {
                        isBipartite = false;
                        break;
                    }
                }
            }

            System.out.println(isBipartite ? "YES" : "NO");
        }
    }

    private static boolean bfs(int start, List<Integer>[] graph, int[] colors) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        colors[start] = 1;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : graph[current]) {
                if (colors[next] == colors[current]) {
                    return false;
                }
                if (colors[next] == 0) {
                    colors[next] = -colors[current];
                    queue.add(next);
                }
            }
        }

        return true;
    }
}