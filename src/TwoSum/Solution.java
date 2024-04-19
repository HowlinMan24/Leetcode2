package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapIntegers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (mapIntegers.containsKey(x)) {
                return new int[]{mapIntegers.get(x), i};
            }
            mapIntegers.put(nums[i], i);
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }
}
