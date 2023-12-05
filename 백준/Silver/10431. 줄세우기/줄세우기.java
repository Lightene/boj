import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for(int i = 1; i <= testcase; i++)
        {
            ArrayList<Integer> cases = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toCollection(ArrayList::new));

            int caseNumber = cases.get(0);

            cases.remove(0);

            int repeat = 0;
            boolean running = true;
            while (running) {
                running = false;
                for (int root = 0; root < 19; root++) {
                    if (cases.get(root) < cases.get(root + 1)) continue;
                    else { // 같은 키는 없다!
                        ++repeat;
                        Collections.swap(cases, root, root+1);
                        running = true;
                    }
                }
            }
            System.out.println(caseNumber+ " "+ repeat);
        }


    }
}
