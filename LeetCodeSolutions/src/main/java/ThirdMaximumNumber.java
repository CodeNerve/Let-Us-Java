public class ThirdMaximumNumber {
    public static void main(String[] args) {
        //Leetcode default solution
    }
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        int ans=nums[i];
        int count=1;
        while(i>=0 && count<3){
            count++;
            i=movePointer(nums,i);
        }

        if(i<0) return ans;
        return nums[i];
    }

    int movePointer(int[] arr,int index){
        int current=arr[index];

        while(index>=0 && arr[index]==current){
            index--;
        }
        return index;
    }
}
