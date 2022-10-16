public class TwoSumII {
    public static void main(String[] args) {
        //Leetcode default code....
    }
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while (start<end){
            int ans = numbers[start]+numbers[end];
            if (ans==target){
                return( new int[] {start+1,end+1});
            }else if(ans<target){
                start++;
            }
            else {
                end--;
            }
        }return new int[2] ;

    }
}
