package PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) { // NOt working
        List<List<Integer>> fullList = new ArrayList<>();
        fullList.add(new ArrayList<>());
        fullList.get(0).add(1);
        fullList.add(new ArrayList<>());
        fullList.get(1).add(1);
        fullList.get(1).add(1);
        for (int i = 2; i < numRows; i++) {
            List<Integer> level = new ArrayList<>();
            List<Integer> beforeLevel = fullList.get(i - 1);
            for (int j = 0; j < i; j++) {
                level.add(beforeLevel.get(j) + beforeLevel.get(j + 1));
            }
            fullList.add(level);
        }
        return fullList;
    }

}
