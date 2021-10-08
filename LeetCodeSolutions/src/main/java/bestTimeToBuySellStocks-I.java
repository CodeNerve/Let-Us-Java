class Solution {
    public int maxProfit(int[] prices) {
        int dpi0 = 0;
        int dpi1 = Integer.MIN_VALUE;
        
        for(int val: prices) {
            dpi0 = Math.max(dpi0, dpi1 + val);
            dpi1 = Math.max(dpi1, -val);
        }
        
        return dpi0;
    }
}
