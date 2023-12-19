import java.io.*;
import java.math.BigInteger;

class Main{
    public static BigInteger fibonacci(BigInteger rev, BigInteger cur, int curIdx, int end){
        if(end == 0){
            return BigInteger.ZERO;
        }
        if(curIdx >= end) return cur;
        return fibonacci(cur, rev.add(cur), ++curIdx, end);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(BigInteger.ZERO, BigInteger.ONE, 1, N));
    }
}