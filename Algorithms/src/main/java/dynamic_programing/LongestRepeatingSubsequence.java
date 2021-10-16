//Example Input:
// Input:
// str = "aab"
// Output: 1
// Explanation: 
// The longest reapting subsequenece is "a".

//Using Tabulation:-

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        int m=str.length();
        return lcs(str,str,m,m);
    }
      int lcs(String x, String y, int m , int n)
    {
        int[][] dp= new int[m+1][n+1];
        
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 || j==0) dp[i][j]=0;
                else
                {    //if characters match and indexes are different
                    if(x.charAt(i-1)==y.charAt(j-1) && j!=i)
                      dp[i][j]=dp[i-1][j-1]+1;
                    //if characters do not match
                    else
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[m][n];
    }
  
  //Time Complexity: O(n^2)   where n is the length of given string
