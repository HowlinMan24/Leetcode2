package ProductOfArrayExceptSelf;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productArray = new int[nums.length];

        int leftProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            productArray[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i++) {
            productArray[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return productArray;
    }
}
