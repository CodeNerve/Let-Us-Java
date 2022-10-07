import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
                Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        
        int [] prices = new int[n];
        for(int i=0;i<n;i++)
        {
            prices[i] = scn.nextInt();
        }
        
        
        int mpist =0;
        int leastsf = prices[0];
        int[] dpl = new int [prices.length];
        
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<leastsf)
            {
                leastsf = prices[i];
            }
            
            mpist = prices[i] - leastsf;
            if(mpist>dpl[i-1])
            {
                dpl[i] = mpist;
            }
            else
            {
                dpl[i] = dpl[i-1];
            }
        }
        
        int mpibt = 0;
        int maxat = prices[prices.length-1];
        int[] dpr = new int [prices.length];
        
        for(int i=prices.length-2;i>=0;i--)
        {
            if(prices[i]>maxat)
            {
                maxat = prices[i];
            }
            
            mpibt = maxat - prices[i];
            if(mpibt>dpr[i+1])
            {
                dpr[i] = mpibt;
            }
            else
            {
                dpr[i] = dpr[i+1];
            }
        }
        
        int op=0;
        for(int i=0; i<prices.length;i++)
        {
            if(dpl[i]+dpr[i]>op)
            {
                op = dpl[i] + dpr[i];
            }
        }
        System.out.println(op);
}
}