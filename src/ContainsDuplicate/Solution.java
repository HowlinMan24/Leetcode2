package ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbersSet = new HashSet<>();
        for (int num : nums) {
            if (numbersSet.contains(num))
                return true;
            else
                numbersSet.add(num);
        }
        return false;
    }
}
