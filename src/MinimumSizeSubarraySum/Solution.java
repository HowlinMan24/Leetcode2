package MinimumSizeSubarraySum;

import java.util.Arrays;
import java.util.Map;
import java.util.Vector;

public class Solution {
    public static int minSubArrayLen(int target, int[] nums) {
//        if (Arrays.stream(nums).sum() < target)
//            return 0;
//        int minSize = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length ; i++) {
//            if (nums[i] == target)
//                return 1;
//            int sum = nums[i];
//            int length = 1;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (sum >= target) {
//                    break;
//                }
//                length++;
//                sum += nums[j];
//            }
//            if (sum >= target)
//                minSize = Math.min(minSize, length);
//        }
//        return minSize;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            //Sliding window
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left++];
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

}
