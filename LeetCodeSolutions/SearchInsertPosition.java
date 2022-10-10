public class Algorithm_Day1_SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int L = 0;
        int H = nums.length-1;
        int M;

        if(nums[0]>target) {
            return 0;
        }
        else if(nums[nums.length-1]<target) {
            return nums.length;
        }
        else {
            while (L<=H) {
                M = L+(H-L)/2;
                if(nums[M]==target) {
                    return M;
                }
                if(nums[M]>target) {
                    H=M-1;
                    if(nums[H]<target) {
                        return H+1;
                    }

                }
                else {
                    L=M+1;
                    if(nums[L]>target) {
                        return L;
                    }

                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] a = {1};
        int t = 0;
        System.out.println(searchInsert(a,t));
    }
}
