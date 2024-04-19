package ValidAnagram;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s2 = s.toCharArray();
        Arrays.sort(s2);
        char[] t2 = t.toCharArray();
        Arrays.sort(t2);
        return Arrays.equals(s2, t2);
    }
}
