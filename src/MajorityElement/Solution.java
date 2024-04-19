package MajorityElement;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> mapElements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mapElements.containsKey(nums[i])) {
                mapElements.put(nums[i], mapElements.get(nums[i]) + 1);
            }
            mapElements.put(nums[i], 1);
        }
        return mapElements.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
