package Counting_Bits;

class Solution {
    public int[] countBits(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            int k = i;
            int counter = 0;
            while (k > 0) {
                if (k % 2 != 0)
                    counter++;
                k /= 2;
            }
            numbers[i] = counter;
        }
        return numbers;
    }
}