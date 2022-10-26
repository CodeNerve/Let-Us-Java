public class Trailing_zeroes {
//    Approach 1:-O(N) time complexity.
//    public static int TrailingZeroes(int num){
//        int temp = 1;
//        for(int i=num;i>0;i-=1){
//            if(i==5||i==2||i%10==0){
//                temp*=i;
//            }
//        }
//        int count =0;
//        while(temp%10==0){
//            count+=1;
//            temp/=10;
//        }
//        return count;
//    }
//    Approach 2:- O(logN) time complexity
    public static int TrailingZeroes(int N){
        int ans = 0;
        for(int i = 5; i <= N; i *= 5) {
            ans += N/i;
        }
        return ans;
    }
}