package 릿코드;

import java.util.HashSet;

public class HappyNumber {
    static public boolean isHappy(int n) {
        HashSet<Integer> memo = new HashSet<Integer>();

        int temp = n;
        memo.add(temp);

        while(true){
            String nString = Integer.toString(temp);

            temp = 0;

            for(char ch: nString.toCharArray()){
                int toInt = Character.getNumericValue(ch);
                temp += Math.pow(toInt, 2);
            }

            if(temp == 1) return true;
            if(memo.contains(temp)) return false;
            memo.add(temp);
        }
    }

    public static void main(String[] args) {
        isHappy(19);
    }
}
