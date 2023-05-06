import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        num_list = Arrays.copyOf(num_list, num_list.length+1);
        if(num_list[num_list.length-2] > num_list[num_list.length-3]){
            num_list[num_list.length-1] = num_list[num_list.length-2] -num_list[num_list.length-3]; 
        }else{
            num_list[num_list.length-1] = num_list[num_list.length-2] * 2;
        }
        return num_list;
    }
}
