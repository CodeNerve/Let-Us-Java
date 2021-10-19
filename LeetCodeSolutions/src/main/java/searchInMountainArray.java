package com.company;

public class searchInMountainArray {

    //find index of the  target in mountain array

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 2, 1};
        int target = 5;
        System.out.println(searachMountain(arr,target));
    }
    static int searachMountain(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                if (arr[mid] > arr[mid + 1]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
