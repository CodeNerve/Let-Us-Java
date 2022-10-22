
//Problem: https://leetcode.com/problems/search-in-rotated-sorted-array/

/**
 Problem:
 https://leetcode.com/problems/search-in-rotated-sorted-array
 Approach:
 Idea is to find the pivot point first using binary search.
 After that the process is same as binary search but instead
 we have to take the rotation into consideration while calculating the rotated mid-index.
 **/


public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left < right) {
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int rotations = left;
        left = 0; right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            int rotatedMid = (mid + rotations)%nums.length;
            if(nums[rotatedMid] == target) {
                return rotatedMid;
            } else if(nums[rotatedMid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
