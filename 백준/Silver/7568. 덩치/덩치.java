import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<int[]> arrayList = new ArrayList<>();
        int[] count = new int[N];
        Arrays.fill(count, 1);

        for(int i = 0; i < N; i++){
            arrayList.add(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray());
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(arrayList.get(i)[0] > arrayList.get(j)[0] && arrayList.get(i)[1] > arrayList.get(j)[1]){
                    ++count[j];
                }
            }
        }

        for(int i = 0; i < N; i++){
            System.out.print(count[i]+" ");
        }
    }
}