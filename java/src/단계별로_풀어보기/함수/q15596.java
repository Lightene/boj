// 15596 - 정수 N개의 합

package 단계별로_풀어보기.함수;

public class q15596 {
    long sum(int[] a){
        long result = 0;
        for(int s : a){
            result += s;
        }
        return result;
    }
}
