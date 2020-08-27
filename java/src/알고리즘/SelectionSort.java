package 알고리즘;

// 선택정렬

public class SelectionSort {

    public static void main(String[] args) {
        int i, j, min, index=0, tmp;


        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for (i =0; i < 10; i++){
            min = 9999;
            for ( j=i; j < 10; j ++){
                if(min > array[j]){
                    min = array[j];
                    index = j;
                }
            }

            tmp = array[i];
            array[i] = array[index];
            array[index] = tmp;

            System.out.printf(i+"번째 : ");
            for(int s = 0; s < 10; s++){
                System.out.printf(array[s]+" ");
            }

            System.out.println("");

        }

    }

}
