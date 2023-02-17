// 4673 - 셀프넘버

package archive.단계별로_풀어보기.함수;

public class q4673 {

    private static int self(int value) {
            int result = value;

            if(value >= 10000){
                result += value / 10000;
                value %= 10000;
            }
            if (value >= 1000) {
                result += value / 1000;
                value %= 1000;
            }
            if (value >= 100) {
                result += value / 100;
                value %= 100;
            }
            if (value >= 10) {
                result += value / 10;
                value %= 10;
            }
            return result += value;
    }

    public static void main(String[] args) {
        int[] arr = new int[10001];

        for(int i = 1; i < 10001; i++){
            int set = self(i);
            if(set < 10001)
                arr[set] = 1;
        }
        for(int i = 1; i < 10001; i++)
            if(arr[i] == 0)
                System.out.println(i);
    }
}
