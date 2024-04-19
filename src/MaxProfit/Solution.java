package MaxProfit;

public class Solution {
    public static void maxProfit(int n, int[] cards) {
        int maxProfit = Integer.MIN_VALUE;
        int sum = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            sum += cards[right];
            while (cards[right] > 0) {
                maxProfit = Math.max(maxProfit, sum);
            }
        }
    }

    public static void main(String[] args) {
        maxProfit(5, new int[]{12, -4, -10, 4, 9});
    }

}
