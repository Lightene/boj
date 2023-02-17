package archive.단계별로_풀어보기.dp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class q1010 {

    static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            // M개중 N개를 뽑는 경우이므로 nCr 에서 n = M, r = N이다.
            int N = Integer.parseInt(st.nextToken());	// N = r
            int M = Integer.parseInt(st.nextToken());	// M = n


            sb.append(combi(M, N)).append('\n');
        }

        System.out.println(sb);

    }

    static int combi(int n, int r) {

        /*
            연산 중에 지정한 M by N 값의 위치에 도달했을 때 0 초과일 경우에 연산 종료하는 시스템인 것 같음.
            문제에서 제한으로 둔 최대 30 을 기준으로 그냥 무식하게 돌리는 도중에 위의 조건에 해당하면 종료.
         */
        // 이미 풀린 경우 바로 반환
        if(dp[n][r] > 0) {
            return dp[n][r];
        }

        /*
            N 과 M 의 값들은 0 부터 N 과 M 까지 전부 순회하기 때문에 전부 1로 채우는 과정임.
            초기에는 0이라 채우고 M 과 N 의 값이 같을 때 또한 1로 바꾼다다
        */

        // 2번 성질
        if(n == r || r == 0) {
            return dp[n][r] = 1;
        }
        
        /*
            지금 것 연산 해온 것들의 값들을 더해준다
         */
        // 1번 성질
        return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }
}