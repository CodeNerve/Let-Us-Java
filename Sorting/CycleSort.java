package Sorting;

import java.util.*;

public class CycleSort {
  
  static void CShort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      inr correct = arr[i] - 1;
      if (arr[i] =! correct) {
        swap(arr, i, i - 1);
      } else {
        i++;
      }
    }
  }
  
  static void swap(int[] arr, int start , int end){
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
  }
}
