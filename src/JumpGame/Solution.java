package JumpGame;

import java.util.Arrays;

class Solution {
    public static int canJump(int[] nums) {
        int reach = 0, counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (reach >= nums.length - 1)
                return counter;
            reach = Math.max(reach, i + nums[i]);
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        canJump(new int[]{2, 3, 1, 1, 4});
    }
}
