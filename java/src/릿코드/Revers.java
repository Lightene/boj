package 릿코드;

import java.util.HashMap;
import java.util.Map;

public class Revers {

    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 0) return nums;
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
            }else{
                map.put(nums[i], i);
            }
        }

        return result;
    }

    public int[] twoSumAnothor(int[] nums, int target) {
        if(nums.length == 0) return nums;
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
            }else{
                map.put(nums[i], i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
