package 알고리즘;

// 버블정렬

public class BubbleSort {

    static int i, j, tmp;

    public static void main(String[] args) {
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for (i = 0; i < 10; i++) {
            for(j = 0; j < 9 - i; j++){
                if(array[j] > array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }


            System.out.printf(i+"번째 : ");
            for(int s = 0; s < 10; s++){
                System.out.printf(array[s]+" ");
            }

            System.out.println("");

        }
    }
}
