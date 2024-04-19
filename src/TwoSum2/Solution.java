package TwoSum2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
//        Map<Integer, Integer> mapValues = new HashMap<>();
//        for (int i = 0; i < numbers.length; i++) {
//            int searchValue = target - numbers[i];
//            if (mapValues.containsKey(searchValue)) {
//                return new int[]{mapValues.get(searchValue), i+1};
//            }
//            mapValues.put(numbers[i], i+1);
//        }
//        return new int[]{0, 0};
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                return new int[]{numbers[start + 1], numbers[end + 1]};
            } else if (numbers[start] + numbers[end] < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[2];
    }
}
