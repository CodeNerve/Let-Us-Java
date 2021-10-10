package com.company;

import java.util.Scanner;

public class BinSearchDesc
{
    public static void main(String[] args)
    {
        int[] arr = {6, 5, 4, 3, 2, 1};
        int target = 2;

        int res = binsearch(arr, target);
      
        System.out.println(res);
    }

    private static int binsearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int middle = start + (end - start) / 2;

            if(target < arr[middle])
            {
                end = middle - 1;
            }
            else if(target > arr[middle])
            {
                start = middle + 1;
            }
            else
            {
                return middle;
            }

        }
        return -1;
    }


}
