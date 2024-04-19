package GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> listsOfAnagrams = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            char[] currentComparingString = strs[i].toCharArray();
            Arrays.sort(currentComparingString);
            listsOfAnagrams.add(new ArrayList<>());
            listsOfAnagrams.get(i).add(Arrays.toString(currentComparingString));
            for (int j = i + 1; j < strs.length; j++) {
                char[] nextSorting = strs[j].toCharArray();
                Arrays.sort(nextSorting);
                if (Arrays.equals(currentComparingString, nextSorting)) {
                    listsOfAnagrams.get(i).add(Arrays.toString(nextSorting));
                }
            }
        }
        return listsOfAnagrams;
    }
}
