//   https://leetcode.com/problems/tallest-billboard/


class Solution {
    public int tallestBillboard(int[] rods) {
        int n = rods.length;
        boolean[][] dp = new boolean[n + 1][10001];
        int[][] max = new int[n + 1][10001];
        dp[0][5000] = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 10000; j++) {
                if (j - rods[i] >= 0 && dp[i][j - rods[i]]) {
                    dp[i + 1][j] = true;
                    max[i + 1][j] = Math.max(max[i + 1][j], max[i][j - rods[i]] + rods[i]);
                }
                if (j + rods[i] <= 10000 && dp[i][j + rods[i]]) {
                    dp[i + 1][j] = true;
                    max[i + 1][j] = Math.max(max[i + 1][j], max[i][j + rods[i]]);
                }
                if (dp[i][j]) {
                    dp[i + 1][j] = true;
                    max[i + 1][j] = Math.max(max[i + 1][j], max[i][j]);
                }
            }
        }
        return max[n][5000];
    }
}
