package archive.단계별로_풀어보기.그리디;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class q1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N, M; // N 상자 수, M 크레인 수
        List<Integer> crane, box;
        int count = 0;

        crane = new ArrayList<>();
        box = new ArrayList<>();

        N = Integer.parseInt(bf.readLine());
        for(String str : bf.readLine().split(" ")){
            crane.add(Integer.parseInt(str));
        }

        M = Integer.parseInt(bf.readLine());
        for(String str : bf.readLine().split(" ")){
            box.add(Integer.parseInt(str));
        }

        Collections.sort(crane, Collections.reverseOrder());
        Collections.sort(box, Collections.reverseOrder());

        if(box.get(0) > crane.get(0)){
            System.out.println(-1);
        }else{
            for(;box.size() != 0;){
                int idx = 0;
                int tmp = 0;

                for(;idx < N;){
                    if(tmp == box.size()) break;
                    if(box.get(tmp) <= crane.get(idx)){
                        box.remove(tmp);
                        idx++;
                    }else tmp ++;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}

/*
 3
 6 8 9
 5
 2 5 2 4 7
 */