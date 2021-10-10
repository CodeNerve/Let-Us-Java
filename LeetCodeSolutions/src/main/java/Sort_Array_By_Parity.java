// QUESTION:
//Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//Return any array that satisfies this condition.
//Example 1:
//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
import java.util.*;
public class Sort_Array_By_Parity {
    public static void main(String[] args) {
       int[] arr = {2,4,3,1};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
    public static int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums); // first sort the array in ascending order
        for(int i = 0; i < nums.length - 1; i++)
        {
            for(int j = i+1; j > 0; j--)
            {
                if(nums[j-1]%2!=0)
                {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
        return nums;
    }
}
