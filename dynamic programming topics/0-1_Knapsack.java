import java.util.*;

class Main{
static int knapsack(int[] wt,int[] val, int n, int W){
    
    int prev[]=new int[W+1];
    
    //Base Condition
    
    for(int i=wt[0]; i<=W; i++){
        prev[i] = val[0];
    }
    
    for(int ind =1; ind<n; ind++){
        for(int cap=W; cap>=0; cap--){
            
            int notTaken = 0 + prev[cap];
            
            int taken = Integer.MIN_VALUE;
            if(wt[ind] <= cap)
                taken = val[ind] + prev[cap - wt[ind]];
                
            prev[cap] = Math.max(notTaken, taken);
        }
    }
    
    return prev[W];
}

public static void main(String args[]) {

  int wt[] = {1,2,4,5};
  int val[] = {5,4,8,6};
  int W=5;
  
  int n = wt.length;
                                 
  System.out.println("The Maximum value of items, thief can steal is " +knapsack(wt,val,n,W));
}
}
