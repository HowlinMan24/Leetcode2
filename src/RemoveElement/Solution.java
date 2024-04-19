package RemoveElement;

import java.util.Arrays;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val)
                counter++;
        }
        for (int i = 0; i < nums.length-counter; i++) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                i--;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length - counter;
    }

    public static void main(String[] args) {
        removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
    }

}
