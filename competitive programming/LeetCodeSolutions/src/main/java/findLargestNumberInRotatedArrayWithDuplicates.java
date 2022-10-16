package com.company;

public class findLargestNumberInRotatedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] arr={2,2,2,5,2,2};
        System.out.println(findPivotWithDuplicates(arr));
    }
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases here {4, 5, 6, 7, 0, 1, 2,}
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            //if elements at middle,start and end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                //NOTE:what if these elements at start and end were the pivot?
                //check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                //check weather end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            //lef t side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            }
            else{
                end=mid-1;
            }

        }

        return -1;

    }

}
