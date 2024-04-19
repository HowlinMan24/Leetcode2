package ex1;

class Solution {
    public int maxArea(int[] height) {
        int start = height[0], end = height[height.length - 1];
        int total;
        if (start > end)
            total = end * end;
        else
            total = start * start;
        for (int i = 0; i < height.length/2; i++) {
            if(start<height[i]) {
                start=height[i];
            }
        }

        return total;
    }
}
