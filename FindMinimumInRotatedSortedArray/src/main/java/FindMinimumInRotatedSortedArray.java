
public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        if(nums.length == 0)
            return 0;
        else if (nums.length == 1)
            return nums[0];
        else if(nums[nums.length - 1] > nums[0])
            return nums[0];
        else
            return binaryFindMinimum(0, nums.length - 1, nums);
    }

    public int binaryFindMinimum(int start, int end, int[] arr){
        if(start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if(arr[mid] > arr[mid + 1])
            return arr[mid + 1];

        if(arr[mid - 1] > arr[mid])
            return arr[mid];

        if(arr[mid] > arr[0])
            return binaryFindMinimum(mid + 1, end, arr);
        else
            return binaryFindMinimum(start, mid - 1, arr);
    }



    public static void main(String[] args){
        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        System.out.println(findMinimumInRotatedSortedArray.findMin(new int[]{4,5,6,7,0,1,2}));

    }
}
