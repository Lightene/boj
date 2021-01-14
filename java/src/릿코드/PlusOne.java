package 릿코드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        if(digits.length == 0){
            return new int[0];
        }

        digits[digits.length - 1]++;

        for(int i = digits.length-1; i >= 0; i--){
            if (i == 0 && digits[i] > 9){
                digits[i] -= 10;

                int[] result = new int[digits.length+1];
                result[0] = 1;
                System.arraycopy(digits,0,result,1,digits.length);
                return result;
            }
            if(digits[i] > 9){
                digits[i] -= 10;
                digits[i-1] += 1;
            }
        }

        return digits;
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int stringInteger = Integer.parseInt(bf.readLine());
//
//        stringInteger += 1;

        PlusOne pl = new PlusOne();
        int[] a = {1,2,3,4};
        System.out.println(Arrays.toString(pl.plusOne(a)));



    }
}
