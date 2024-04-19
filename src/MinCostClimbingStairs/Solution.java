package MinCostClimbingStairs;

import java.util.Arrays;

public class Solution {
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dynamicArray = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2)
                dynamicArray[i] = cost[i];
            else
                dynamicArray[i] = cost[i] + Math.min(dynamicArray[i - 1], dynamicArray[i - 2]);
        }
        return Math.min(dynamicArray[n - 1], dynamicArray[n - 2]);
    }


    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

}
