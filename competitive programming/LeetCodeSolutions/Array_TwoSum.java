import java.util.*;

public class Array_TwoSum {
    public void rotate(int[] nums, int k) {
        if(k>= nums.length) {
            k = k-nums.length;
        }
        int [] arr = new int[nums.length];
        for(int i=0;i< nums.length;i++) {
            if(i<k) {
                arr[i] = nums[nums.length-k+i];
            }
            else {
                arr[i] = nums[i-k];
            }
        }
        for(int i=0;i<nums.length;i++) {
            nums[i] = arr[i];
        }
    }
}
