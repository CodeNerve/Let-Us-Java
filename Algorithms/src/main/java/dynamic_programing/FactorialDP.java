public class FactorialDP {
    public int fact (int n){
            int [] memo = new int [n+1];
            memo [0] =1;
            for(int i=1; i<=n; i++){
                memo[i] = i* memo[i-1];
            }
            return memo[n];
        }
}