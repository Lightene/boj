import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        int comp1, comp2;
        comp1 = 1;
        comp2 = 0;
        
        for(int i : num_list){
            comp1 = comp1 * i;
            comp2 += i;
        }
        
        comp2 = (int)Math.pow(comp2, 2);
        
        if(comp1 < comp2) return 1;
        return 0;
    }
}