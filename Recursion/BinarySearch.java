package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int n = a.length;
        int start = a[0];
        int end = a[n-1];
        int ans = binary(a,2,start,end);
        System.out.println(ans);
    }
    static int binary(int[] a,int target,int start, int end){

        int mid = start + (end-start)/2;
        if(a[mid] == target){
            return mid;
        }
        if(a[mid]>target){
            start = a[0];
            end = a[mid-1];
            return binary(a,target,start,end);
        }
        if(a[mid]<target){
            start = a[mid+1];
            return binary(a,target,start,end);
        }
        return -1;
    }
}
