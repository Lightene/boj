package 단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split("-");

        int operator = 1;
        int result = 0;

        for(String str : input){
            String[] splitInput = str.split("\\+");
            int temp = 0;

            for(String splitStr : splitInput){
                temp+= Integer.parseInt(splitStr);
            }

            result += operator * temp;
            operator = -1;
        }
        System.out.println(result);
    }

}


//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String input = bf.readLine();
//        char[] ch = input.toCharArray();
//
//        int operator = 1;
//        int position = 0;
//        int result = 0;
//
//
//        for(int i = 0; i < input.length(); i++)
//        {
//            if(43 == ch[i] || 45 == ch[i])
//            {
//                result += operator * Integer.parseInt(input.substring(position, i));
//                operator = 75 == ch[i] ? 1 : -1;
//                position = i + 1;
//
//                System.out.println(result);
//            }
//        }
//
//        System.out.println(result);
//    }
