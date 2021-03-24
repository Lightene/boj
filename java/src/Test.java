import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int idx = sc.nextInt()+1;

        int temp1, temp2;
        temp1 = temp2 = 0;

        for(int i = 0; i <= idx; i++){
            if( i == 0) {
                temp1 = 0;
                System.out.println(temp1);
                continue;
            }
            if( i == 1) {
                temp2 = 1;
                System.out.println(temp2);
                continue;
            }
            if( i%2 == 0 ){
                temp2 += temp1;
                System.out.println(temp2);
            }
            else{
                temp1 += temp2;
                System.out.println(temp1);
            }

        }
    }
}
