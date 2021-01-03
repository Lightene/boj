package 알고리즘;

public class MergeSort {

    static int num = 8;
    static int size;
    static int[] sorted = new int[8];
    static int cnt = 0;


    static void merge(int a[], int m, int middle, int n){
        int i = m;
        int j = middle;
        int k = m;

        while(i <= middle && j <= n){
            if(a[i] <= a[j]){
                sorted[k] = a[i];
                i++;
            } else {
                sorted[k] = a[j];
                j++;
            }
            k++;
        }

        if(i > middle){
            for(int t = j; t <= n; t++){
                sorted[k] = a[t];
                k++;
            }
        } else{
            for(int t = i; t <= middle; t++){
                sorted[k] = a[t];
                k++;
            }
        }
        for(int t= m; t<=n; t++){
            a[t] = sorted[t];
        }
    }

    static void mergeSort(int a[], int m, int n){
        if(m < n){
            int middle = (m+n)/2;
            mergeSort(a,m,middle);
            mergeSort(a,middle+1,n);
            merge(a,m,middle,n);
        }
    }

    public static void main(String[] args) {
        int[] array = {7,6,5,8,3,5,9,1};

        mergeSort(array,0,num-1);

        for(int i =0; i < num; i++){
            System.out.printf("%d ", array[i]);
        }

    }
}
