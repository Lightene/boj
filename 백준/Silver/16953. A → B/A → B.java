import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int not = -1;
    static public void atob(long a, long b, int cnt){
        if(a == b) {
            not=0;
            System.out.println(cnt);   
        }
        if(a > b) return;
        atob((a*10)+ 1, b, cnt+1);
        atob(a*2, b, cnt+1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split(" ");

        long A = Integer.parseInt(input[0]);
        long B = Integer.parseInt(input[1]);
        
        atob(A, B, 1);

        if(not<0){
            System.out.println(not);
        }
        
    }

}
