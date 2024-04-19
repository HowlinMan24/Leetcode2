package LongestUnequalAdjacentGroupsSubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> stringList = new ArrayList<>();
        StringBuilder st = new StringBuilder();
        if (words.length == 1)
            return Arrays.stream(words).toList();
        else if (words.length == 2) {
            if (groups[0] != groups[1])
                return Arrays.stream(words).toList();
            stringList.add(words[0]);
            return stringList;
        }
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] != groups[i + 1]) {
                st.append(words[i]).append(" ");
            } else {
                String[] parts = st.toString().split("\\s+");
                stringList.addAll(Arrays.asList(parts));
                st = new StringBuilder();
            }
        }
        if (groups[groups.length - 1] != groups[groups.length - 2]) {
            stringList.add(words[groups.length - 1]);
        }
        if (stringList.isEmpty())
            stringList.add(st.toString());
        return stringList;
    }
}