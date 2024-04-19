package RotateArray;

import java.util.Arrays;

class Solution {
    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int end = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = end;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

}