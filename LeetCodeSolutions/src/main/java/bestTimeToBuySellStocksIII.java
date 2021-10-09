import java.io.*;
import java.util.*;

class bestTimeToBuySellStocksIII {
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
        
        return dpi20; 
    }

    public static void main(String[] args) {
        
    }
}