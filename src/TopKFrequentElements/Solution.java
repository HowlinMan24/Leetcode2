package TopKFrequentElements;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int counter = 0;
        Map<Integer, Integer> integerFrequency = new TreeMap<>();
        for (int i = 1; i < nums.length; i++) {
            if (integerFrequency.containsKey(nums[i])) {
                integerFrequency.put(nums[i], integerFrequency.get(nums[i]) + 1);
            } else {
                integerFrequency.put(nums[i], 1);
            }
        }
        return integerFrequency.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
