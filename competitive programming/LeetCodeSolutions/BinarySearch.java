import java.util.*;

public class Algorithm_Day1_BinarySearch {
    public int search(int[] nums, int target) {
        int L = 0;
        int H = nums.length-1;
        if(nums[L]==target ) {
             return L;
        }
        else if(nums[H]==target ) {
             return H;
        }
        int M = L+H/2;

        while (L!=H) {
            if(nums[M]>target) {
                H=M;
            }
            else if(nums[M]<target) {
                L=M;
            }
            else {
                return M;
            }
        }
        return -1;
    }
}
