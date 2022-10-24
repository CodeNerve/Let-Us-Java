/**
  Problem:https://leetcode.com/problems/minimum-path-sum
 **/

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        int[][] dp = new int[r][c];
        dp[0][0] = grid[0][0];
        for(int i = 1;i < r;i++) {
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }
        for(int j = 1;j < c;j++) {
            dp[0][j] = grid[0][j] + dp[0][j-1];
        }

        for(int i = 1;i<r;i++) {
            for(int j = 1;j<c;j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[r-1][c-1];
    }
}
