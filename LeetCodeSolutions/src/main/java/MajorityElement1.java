class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int i,j=0,majority=0;
        for(i=0;i<n;i++)
        {
            if(j==0)
            {
                majority=nums[i];
                j=1;
            }
            else if (majority == nums[i])
                j++;
            else
                j--;
        }
        return majority;
    }
}
