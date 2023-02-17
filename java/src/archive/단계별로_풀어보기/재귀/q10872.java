//  10872 - 팩토리얼

package archive.단계별로_풀어보기.재귀;

import java.util.Scanner;
public class q10872{
    public static int factorial(int value){
        int result = 1;
        for (int i=1; i<=value; i++){
            result *= i;
        }
        return result;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(factorial(N));
    }
}
