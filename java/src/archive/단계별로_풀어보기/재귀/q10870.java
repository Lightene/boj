// 10870 - 피보나치수 5

package archive.단계별로_풀어보기.재귀;

import java.util.Scanner;

public class q10870 {
    static int fi(int idx, int []list){
        return list[idx-1]+list[idx-2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N+1];

        list[0] = 0;
        list[1] = 1;

        for(int i =2; i < N + 1; i++){
            list[i]=fi(i, list);
            System.out.println(i+"인덱스 "+list[i]);
        }

        System.out.println(list[N]);
    }

//    공간 복잡도 해결해본 방식

//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int idx = sc.nextInt()+1;
//
//        int temp1, temp2;
//        temp1 = temp2 = 0;
//
//        for(int i = 0; i <= idx; i++){
//            if( i == 0) {
//                temp1 = 0;
//                System.out.println(temp1);
//                continue;
//            }
//            if( i == 1) {
//                temp2 = 1;
//                System.out.println(temp2);
//                continue;
//            }
//            if( i%2 == 0 ){
//                temp2 += temp1;
//                System.out.println(temp2);
//            }
//            else{
//                temp1 += temp2;
//                System.out.println(temp1);
//            }
//
//        }
//    }
}
