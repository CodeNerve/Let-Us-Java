class Solution {
    public int minDistance(String a, String b) {
        int[][] dp=new int[a.length()][b.length()];
        return rec(a,b,0,0,dp);
    }
    int rec(String a,String b,int i,int j,int[][] dp){
        if(i==a.length()) return b.length()-j; 
        else if(j==b.length()) return a.length()-i;
        if(dp[i][j]!=0) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j] = rec(a,b,i+1,j+1,dp);
        return dp[i][j] = 1+ Math.min(rec(a,b,i,j+1,dp),Math.min(rec(a,b,i+1,j,dp),rec(a,b,i+1,j+1,dp))); // //del,ins,replace
    }
}
