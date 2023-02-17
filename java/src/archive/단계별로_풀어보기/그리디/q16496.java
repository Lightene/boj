package archive.단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class q16496 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        String[] arr = bf.readLine().split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(arr));

        list.sort((o1, o2) -> {
            if (o1.charAt(0) == o2.charAt(0)) {
                return o2.concat(o1).compareTo(o1.concat(o2)) ;
            } else {
                return Character.compare(o2.charAt(0), o1.charAt(0));
            }
        });


        list.forEach(System.out::print);

    }
}
