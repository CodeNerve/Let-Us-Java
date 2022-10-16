package Sorting;

import java.util.*;

public class BubbleSort {

    public static void swap(int[] arr,int a,int b)  // Swapping Method
    {   int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args){
        // Input an array first
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of array : ");
            int n = sc.nextInt();  // To input the size of the array i.e. n
            int[] arr = new int[n];  // Created an array of size n
            System.out.print("Enter "+n+" elements : ");
            for(int i=0;i<n;i++)
            { arr[i]=sc.nextInt(); }  // Input the elements of the array

        // Sorting part
            // In bubble sorting, the sorted part goes to the right of the array

            for(int i = 0; i < arr.length - 1 ; i++)
            {   // The sorted part of array will always start from end of the array

                for(int j = 0 ; j < arr.length - 1 - i ; j++)  // After each iteration, the sorted part increases
                {
                    if(arr[j] > arr[j+1]) swap(arr, j,j+1);  // We swap the position
                }

            }

        // Printing the array
            System.out.print("Sorted Array is : ");
            for(int i: arr) System.out.print(i+" ");

    }
}
