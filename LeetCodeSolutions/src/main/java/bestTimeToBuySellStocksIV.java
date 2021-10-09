import java.io.*;
import java.util.*;

class bestTimeToBuySellStocksIV {
    public int maxProfit(int k, int[] prices) {
        int[] dpik0 = new int[k + 1];
        int[] dpik1 = new int[k + 1];

        Arrays.fill(dpik1, Integer.MIN_VALUE);

        for (int val : prices) {
            for (int i = k; i >= 1; i--) {
                dpik0[i] = Math.max(dpik0[i], dpik1[i] + val);
                dpik1[i] = Math.max(dpik1[i], dpik0[i - 1] - val);
            }
        }

        return dpik0[k];
    }
}