public class MissingNumber {
    public static void main(String[] args) {
        //Leetcode default solution
    }
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] !=nums[correct])// we can write arr[i] != arr[i]  but for                                                                  looking esay and accorindy to future ques;
            {
                swap(nums,i,correct);
            }
            else
            {
                i++;
            }
        }

        // check
        for(int index=0;index < nums.length;index++)
        {
            if(nums[index] != index)                       //means index is 3 and vlaue is 4
            {
                return index;

            }
        }


        return nums.length;


        // swap function
    }
    public void swap(int[] nums, int first,int second)
    {
        int temp= nums[first];
        nums[first]=nums[second];
        nums[second] = temp;
    }
}
