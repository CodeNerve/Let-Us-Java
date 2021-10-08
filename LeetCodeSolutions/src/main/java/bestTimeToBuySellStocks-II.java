class Solution {
    public int maxProfit(int[] prices) {
        int dpi0 = 0;
        int dpi1 = Integer.MIN_VALUE;
        
        for(int val: prices) {
            int temp = dpi0;
            dpi0 = Math.max(dpi0, dpi1 + val);
            dpi1 = Math.max(dpi1, temp - val);
        }
        
        return dpi0;
    }
}