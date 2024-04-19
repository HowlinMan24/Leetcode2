package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = Integer.MIN_VALUE;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        return maxLength;
    }
}
