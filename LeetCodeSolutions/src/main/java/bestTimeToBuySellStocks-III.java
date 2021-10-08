class Solution {
    public int maxProfit(int[] prices) {
        int dpi10 = 0;
        int dpi20 = 0;
        int dpi11 = Integer.MIN_VALUE;
        int dpi21 = Integer.MIN_VALUE;
        
        for(int val: prices) {
            dpi20 = Math.max(dpi20, dpi21 + val);
            dpi21 = Math.max(dpi21, dpi10 - val);
            dpi10 = Math.max(dpi10, dpi11 + val);
            dpi11 = Math.max(dpi11, - val);
        }
        
        Recurrence relation is given as
        dp[i][k][0] = max(dp[i-1][k][0], dp[i-1][k][1] + price[i]);
        dp[i][k][1] = max(dp[i-1][k][1], dp[i-1][k-1][0] - price[i]);
        
        return dpi20; 
    }
}