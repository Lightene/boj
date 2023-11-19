import java.io.*;
import java.util.Arrays;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Arrays.stream(br.readLine().strip().split(" ")).filter( n -> !n.isBlank()).count());
    }
}