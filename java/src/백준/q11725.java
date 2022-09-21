package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list[] = new ArrayList[N + 1];

        // 여기부터 시작

        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();  // 초기화
        }

        for (int i = 0; i < N - 1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int third = Integer.parseInt(st.nextToken());

            list[first].add(third);
            list[third].add(first);
        }

        boolean check[] = new boolean[N+1];

        // BFS
        Queue<Integer> queue = new LinkedList<>();

        // 정점 1에서 시작
        queue.add(1);
        check[1] = true;
        int ans[] = new int [N+1];

        // 큐가 빈값이 될때까지
        while (!queue.isEmpty()){
            Integer num = queue.poll();

            // 특정 부모노드는 자식노드가 복수를 가질수 있다.
            for(Integer i : list[num]){
                if(!check[i]){  // 접근한적 없는 노드일 경우
                    check[i] = true;
                    ans[i] = num;
                    queue.add(i);
                }
            }
        }

        for(int i = 2; i < ans.length; i++)
        {
            System.out.println(ans[i]);
        }
    }
}
