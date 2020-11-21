package 단계별로_풀어보기.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];
        char[] strToChar = bf.readLine().toUpperCase().toCharArray();

        char result_char = '?';
        int result_cnt = 0;
        for(char ch : strToChar){
            alpha[ch-65]++;
            if(result_cnt < alpha[ch-65]){
                result_char = ch;
                result_cnt = alpha[ch-65];
            }
            else if(result_cnt == alpha[ch-65]){
                result_char = '?';
            }
        }
        System.out.println(result_char);
        
//        두번째 수정한 코드
//        Map<Character,Integer> map = new HashMap<>();
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        char[] strToChar = bf.readLine().toUpperCase().toCharArray();
//
//        for(char key: strToChar){
//            map.put(key,map.getOrDefault(key,0)+1);
//        }
//
//        List<Character> list = new ArrayList<>(map.keySet());
//
//        Collections.sort(list, (c1, c2) -> (map.get(c2).compareTo(map.get(c1))));
//
//        if(map.get(list.get(0)).equals(map.get(list.get(1)))){
//            System.out.print("?");
//        }else{
//            System.out.println(list.get(0));;
//        }


//        처음에 짯던 코드

//        Map<Character,Integer> map = new HashMap<>();
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        char[] strToChar = bf.readLine().toUpperCase().toCharArray();
//
//        for(char ch : strToChar){
//            char toUpper = Character.toUpperCase(ch);
//            if(map.containsKey(toUpper)){
//                int tmp = map.get(toUpper);
//                map.replace(toUpper,tmp+1);
//            }else{
//                map.put(toUpper,1);
//            }
//        }
//
//        List<Character> list = new ArrayList<>(map.keySet());
//
//        Collections.sort(list, (c1, c2) -> (map.get(c2).compareTo(map.get(c1))));
//
//        if(map.get(list.get(0)).equals(map.get(list.get(1)))){
//            System.out.print("?");
//        }else{
//            System.out.println(list.get(0));;
//        }

    }
}
