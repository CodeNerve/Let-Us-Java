//  https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        int i=0;
        int reverse[]= new int[15];
    int j=0;
       int original[]= new int[15];
        if(x<0)
            return false;
    while(x>0)
    {
        reverse[i++]=x%10;
        x/=10;
    }
    while(j<i)
    {
        original[j]=reverse[i-j-1];
        j++;
    }
    for(int k=0;k<original.length;k++)
    {
        if(original[k]!=reverse[k])
            return false;
    }
    return true;
        
    }
}
