package 알고리즘;

// 삽입정렬

public class InsertionSort {

    public static void main(String[] args) {
        int i, j, tmp;

        int [] array = {1,10,5,8,7,6,4,3,2,9};

        for(i = 0; i < 9; i++){
            j = i;
            while (array[j] > array[j+1]){
                tmp = array[j];
                array[j] = array[j+1];
                array[j+1] = tmp;
                j--;
            }
        }
        for(i=0; i < 10; i++){
            System.out.printf("%d ",array[i]);
        }
    }

}
