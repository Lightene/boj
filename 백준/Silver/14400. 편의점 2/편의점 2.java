import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int caseCount = Integer.parseInt(br.readLine().trim());

        int[] x = new int[caseCount];
        int[] y = new int[caseCount];
        for(int i = 0; i < caseCount; i++){
            st = new StringTokenizer(br.readLine(), " ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(x);
        Arrays.sort(y);

        long result = 0;

        for(int i = 0; i < caseCount; i++)
        {
            result += Math.abs(x[i]-x[caseCount/2]) + Math.abs(y[i]-y[caseCount/2]);
        }

        System.out.println(result);
    }
}