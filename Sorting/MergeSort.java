package Sorting;

import java.util.Scanner;

public class MergeSort {

    public static void mergeSort(int[] arr, int l, int h)
    {
        if(l<h)
        {
            int mid = (l+h)/2;

            mergeSort(arr, l, mid); // First half split
            mergeSort(arr,mid+1, h);  // Second half split

            merge(arr,l,mid,h);
        }

    }

    public static void merge(int[] arr, int l, int mid, int r)
    {
        int n1 = mid - l + 1;  // Size of 1st temporary array
        int n2 = r - mid;  // Size of 2nd temporary array

        int[] a = new int[n1];   // 1st temporary array
        int[] b = new int[n2];   // 2nd temporary array

        // Copy the data into the two temporary arrays
        for(int i=0; i<n1; i++) a[i] = arr[l + i];  // (l + i) will give first half of the array elements

        for(int j=0; j<n2; j++) b[j] = arr[mid + 1 + j]; // (mid + 1 + j) will give next half of the array elements

        // To finally merge the two arrays

        int i = 0;  // Initial index for 1st temporary array
        int j = 0;  // Initial index for 2nd temporary array
        int k = l;  // Initial index for the main array i.e. arr[]

        while( i < n1 && j < n2 )
        {
            if(a[i] < b[j]) // If the element of 1st array is greater than 2nd array at given index i & j
            {
                arr[k] = a[i]; // Assign the value to main array
                i+=1;   k+=1;   // Increment the pointer
            }

            else
            {
                arr[k] = b[j];
                j+=1;   k+=1;
            }
        }

        // If there are remaining elements in 1st temporary array, then copy it
        while( i < n1)
        {
            arr[k] = a[i];
            i+=1;   k+=1;   // Increment pointer
        }

        // If there are remaining elements in 2nd temporary array, then copy it
        while( j < n2)
        {
            arr[k] = b[j];
            j+=1;   k+=1;   // Increment pointer
        }
    }

    public static void main(String[] args)
    {
        // Input an array first
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();         // To input the size of the array i.e. n
        int[] arr = new int[n];       // Created an array of size n

        System.out.print("Enter "+n+" elements : ");
        for(int i = 0 ; i < n ; i ++)
        { arr[i] = sc.nextInt();  }   // Input the elements of the array [ 20, 35, -15, 7, 55, 1, -22 ]

        mergeSort(arr, 0, arr.length-1);  // Calling the function

        // Printing the array
        System.out.print("Sorted Array is : ");
        for(int i: arr) System.out.print(i+" ");
    }

}
