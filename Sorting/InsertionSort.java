package Sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args)
    {
        // Input an array first
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();         // To input the size of the array i.e. n
        int[] arr = new int[n];       // Created an array of size n

        System.out.print("Enter "+n+" elements : ");
        for(int i = 0 ; i < n ; i ++)
        {
            arr[i] = sc.nextInt();     // Input the elements of the array [ 20, 35, -15, 7, 55, 1, -22 ]
        }


        // Sorting Part
            // In Insertion Sort, we assume that the first element is sorted. So we start our operation from index 1.
            // No swapping happens in this method.
            // Isme hum ek particular range bnate hai aur har iteration me smallest element ko left hand side move
            // krwate hai.

        for(int firstUnsorted = 1; firstUnsorted < arr.length ; firstUnsorted ++)
        {
            int save = arr[firstUnsorted];   // Saving the element to compare.

            int i;  // Declaring this variable outside the loop to save the index position for finally assigning save.

            for( i = firstUnsorted; i > 0 && arr[i-1] > save; i--)
                // We put this condition (arr[i-1] > save) so that hum
                // har outer loop ke iteration mei har array index ki value change na kre aur vo part skip hojaye.
            {
                   arr[i] = arr[i - 1];
            }

            arr[i] = save;  // At last we assign save to it's correct position as per sorting order.
        }



        // Printing the array
        System.out.print("Sorted Array is : ");
        for(int i: arr) System.out.print(i+" ");
    }

}