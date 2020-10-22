package dynamic_programing;

class Solution {
    
    public int fib(int n) {
     int f[] = new int[n+1];
     int i;
     f[0] = 0;
     f[1] = 1;

     for (i = 2; i <= n; i++) {
         f[i] = f[i-1] + f[i-2];
      }

      return f[n];
    }
}
