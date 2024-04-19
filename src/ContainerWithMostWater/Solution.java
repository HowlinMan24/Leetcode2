package ContainerWithMostWater;

public class Solution {
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = calculateArea(Math.min(height[start], height[end]), end - start);
        while (start < end) {
            if (calculateArea(Math.min(height[start], height[end]), end - start) > maxArea) {
                maxArea = calculateArea(Math.min(height[start], height[end]), end - start);
//                end -= start;
            } else if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;
    }

    public static int calculateArea(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{2, 3, 10, 5, 7, 8, 9}));
    }

}

