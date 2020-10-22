package sorting;

import java.util.Arrays;
import java.util.Scanner;

class bubbleSort {

    public static void main(String[] args) {
        int N;
        Scanner in = new Scanner(System.in);
        System.out.println("please give the size of the array");
        N = in.nextInt();
        int[] arr = new int[N];
        System.out.println("Ok! Now please give the array to sort");

        //scanning the array
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        bubbleSort(arr);
        System.out.println("The sorted array is");
        System.out.println(Arrays.toString(arr));
    }


    static void bubbleSort(int[] array) {
        int temp;
        //iterating through the array
        for(int i=0; i < array.length; i++){
            for(int j=1; j < (array.length-i); j++){
                if(array[j-1] > array[j]){
                    //swapping the elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}