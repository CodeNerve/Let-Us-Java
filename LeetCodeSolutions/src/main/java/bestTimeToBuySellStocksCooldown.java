import java.io.*;
import java.util.*;

class bestTimeToBuySellStocksCooldown {
    public int maxProfit(int[] prices) {
        int dpi0 = 0;
        int dpi0prev = 0;
        int dpi1 = Integer.MIN_VALUE;
        
        for(int val: prices) {
            int temp = dpi0;
            dpi0 = Math.max(dpi0, dpi1 + val);
            dpi1 = Math.max(dpi1, dpi0prev - val);
            dpi0prev = temp;
        }
        
        return dpi0;
    }

    public static void main(String[] args) {
        
    }
}