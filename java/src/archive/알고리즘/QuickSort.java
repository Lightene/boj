package archive.알고리즘;

public class QuickSort {

    static int [] array = {3,7,8,1,5,9,6,10,2,4};
    static int number = 10;

    public static void quickSort(int[] data,int start, int end){
        if(start >= end) return;

        int key = start;    // pivot
        int i = start + 1;  // 왼쪽 끝부터 오른쪽 시작 순회
        int j = end;        // 오른쪽 끝부터 왼쪽 시작 순회
        int tmp;

        while(i<=j) {
            while(i <= end && data[i] < data[key]) i++; // 오른쪽 방향 --->, 키 값보다 작은 값
            while(j >= key && data[j] > data[key]) j--; // 왼쪽 방향 <---, 키 값보다 큰 값

            if(i > j){
                tmp = data[j];
                data[j] = data[key];
                data[key] = tmp;
            }else {
                tmp = data[i];
                data[i] = data[j];
                data[j] = tmp;
            }
        }
        quickSort(data, start, j-1);
        quickSort(data, j+1, end);
    }

    public static void main(String[] args) {
        quickSort(array,0,number-1);
        for(int i = 0; i < number; i++){
            System.out.printf("%d ",array[i]);
        }
    }
}
