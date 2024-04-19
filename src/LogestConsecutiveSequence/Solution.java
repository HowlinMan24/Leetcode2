package LogestConsecutiveSequence;

import java.util.*;

public class Solution {
    public static int longestConsecutive(int[] nums) {
//        Map<Integer, Integer> integerMap = new TreeMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            integerMap.put(nums[i], nums[i]);
//        }
//        int counter = 0, maxCounter = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (integerMap.containsKey(nums[i] + 1))
//                counter++;
//            else {
//                maxCounter = Math.max(maxCounter, counter);
//                counter = 0;
//            }
//        }
        Set<Integer> numbersSet = new TreeSet<>();
        for (int num : nums) {
            numbersSet.add(num);
        }
        nums = numbersSet.stream().mapToInt(x -> x).toArray();
        int counter = 0, maxCounter = 0;
        for (int i = 1; i <= numbersSet.size(); i++) {
            if (nums[i - 1] + 1 == nums[i])
                counter++;
            else {
                maxCounter = Math.max(maxCounter, counter);
                counter=0;
            }
        }
        return maxCounter;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }
}
