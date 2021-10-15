//LeetCode Problem Number #55

// Approach: We start iterating from the last index (which is the destination). 
//           If we are able to reach the 0th index i.e. from where the jump needs 
//           to start, it returns True and vice versa.

//Input Example:
// Input: nums = [2,3,1,1,4]
// Output: true
// Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

class JumpGame {
    public boolean canJump(int[] nums) {

       int n=nums.length-1;
       int index=n; //since we start checking from the last index

        for(int i=n;i>=0;i--)
        {
            if(nums[i]+i>=index) //if sum of nums[i]+i> index then this means it can reach index from the position i
                index=i;  //updating index
        }
        return index==0; //if index turns out to be 0, we can reach the end from the 0th index i.e. the starting point. Hence, returns True else false.
    }
}

//Time Complexity: O(N) , where N is length of given array.
//Space Complexity: O(1), no extra space is needed in this solution.
