package H_Index;

import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        int hIndex = 0, maxIndex = 0;
        for (int i = 0; i < citations.length; i++) {
            int counter = 0;
            for (int j = 0; j < citations.length; j++) {
                if (citations[i] < citations[j] && citations[i] !=0) {
                    counter++;
                }
            }
            if (counter > maxIndex) {
                maxIndex = counter;
                hIndex = citations[i];
            }
        }
        return hIndex;
//        return (int) Math.floor((double) Arrays.stream(citations).sum() / citations.length);
    }
}
