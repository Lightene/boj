package 단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class q2812 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] str = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = str[0];
        int K = str[1];

        List<Integer> inputN = Arrays.stream(bf.readLine().split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedList<Integer>::new));

        Stack<Integer> stack = new Stack<>();

        stack.push(inputN.get(0));

        int[] arr = new int[K];
        arr[0] = inputN.get(0);

        int idx = 0;
        int lastIdx = 1;

        while (idx < K){
            for (int i = 0; i < inputN.size(); i++){
                if(arr[idx] < inputN.get(i)){
                    arr[idx] = inputN.get(i);
                    lastIdx = i;
                }
            }
            inputN.remove(lastIdx);
            idx++;
        }

        for (int i : arr){
            System.out.print(i);
        }

    }
}
