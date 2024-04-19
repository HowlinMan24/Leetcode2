package DNA.RandomStuff;

import java.util.Arrays;

public class BinomialCoefficient {

    public static void calculateBinomial(int n, int m) {
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++)
            dp[i][0] = 1;

        for (int j = 1; j <= n; j++) {
            dp[j][j] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(dp[n][m]);
    }

    public static void main(String[] args) {
        int n = 10, m = n / 2;
        calculateBinomial(n, m);
    }
}