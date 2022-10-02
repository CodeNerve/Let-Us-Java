//https://codeforces.com/problemset/problem/1637/C
//BY PRATIK AGRAWAL https://github.com/PratikAgrawal02/

import java.util.Scanner;
 
public class pb5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
 
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i< n ; i++){
                arr[i] = sc.nextLong();
            }
            if (n == 2){
                System.out.println(0);
                continue;
            }
 
            System.out.println(solve(arr , n));
 
 
        }
    }
 
    static long solve(long[] arr , int n){
 
        if (n == 3 && arr[1]% 2 != 0) return -1;
 
        boolean isAllOne = true;
        for (int i = 1 ; i < n-1 ; i++){
            if (arr[i] > 1){
                isAllOne = false;
                break;
            }
        }
        if (isAllOne) return -1;
 
        long sum = 0;
        for (int i = 1 ; i < n-1 ; i++){
            sum += (arr[i]+1)/2;
        }
        return sum;
 
 
    }
}
