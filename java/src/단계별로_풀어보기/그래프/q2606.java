package 단계별로_풀어보기.그래프;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class q2606 {
    static int[][] node;
    static int[] check;

    static int bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        check[start] = 1;
        queue.offer(start);
        int cnt = 0;
        while (!queue.isEmpty())
        {
            int x = queue.poll();

            for(int i=1; i<node.length; i++)
            {
                if (node[x][i] == 1 && check[i] != 1){
                    queue.offer(i);
                    check[i] = 1;
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());

        node = new int[n+1][n+1];
        check = new int[n+1];

        for(int i = 0; i < m; i++){
            int[] stoi = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int i1 = stoi[0];
            int i2 = stoi[1];
            node[i1][i2] = node[i2][i1] = 1;
        }

        System.out.println(bfs(1));
    }

}


/*
 *
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int computer = Integer.parseInt(bf.readLine());
        int computer_node = Integer.parseInt(bf.readLine());

        List<List<Integer>> node = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < computer_node + 1; i++) {
            String[] str = bf.readLine().split(" ");
            List<Integer> convertList = new ArrayList<>();
            Arrays.stream(str).mapToInt(Integer::parseInt).forEach(convertList::add);
            node.add(convertList);
        }

        node.sort(Comparator.comparingInt(o -> o.get(0)));

        for(List<Integer> i : node){
            if(i.get(0).equals(1)||i.get(1).equals(1)){
                result.add(i.get(1));
                result.add(i.get(0));
                continue;
            }
            if(result.contains(i.get(0))||result.contains(i.get(1))){
                result.add(i.get(0));
                result.add(i.get(1));
            }
        }

        HashSet<Integer> set = new HashSet<>(result);

        System.out.println(set.toString());


    }
 *
 */