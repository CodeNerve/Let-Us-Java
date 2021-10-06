package Sorting;

import java.util.*;

public class SelectionSort {

    public static void swap(int[] arr,int a,int b)  // Swapping Method
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args)
    {
        // Input an array first
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();  // To input the size of the array i.e. n
        int[] arr = new int[n];  // Created an array of size n
        System.out.print("Enter "+n+" elements : ");
        for(int i=0;i<n;i++)
        { arr[i]=sc.nextInt(); }  // Input the elements of the array


        // Sorting Part
                // In Selection Sort also, we keep the sorted part at the right size

        for(int i = arr.length-1 ; i > 0 ; i--)    // i denotes the last sorted index of the array
        {
            int l_Index = 0; // Index of the largest element in the array (Assumed to be at 0th Position).

            for(int j = 0; j <= i; j++)
            {
                if( arr[j] > arr[l_Index]) l_Index = j;     // We find the largest element in the array
            }                                               // And assign l_index to it's index position

            swap(arr, i, l_Index);   // Later we swap the position of ith element with l_index
        }

        // Printing the array
        System.out.print("Sorted Array is : ");
        for(int i: arr) System.out.print(i+" ");
    }
}
