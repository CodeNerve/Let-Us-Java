public class Algorithm_Day3_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int z = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                z++;
            }
        }
        int s=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                nums[s] = nums[i];
                s++;
            }
        }
        for(int i=nums.length-z;i<nums.length;i++) {
            nums[i] = 0;
        }
    }
}
