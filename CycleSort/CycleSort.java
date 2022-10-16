package array.sorting;

public class CycleSort {
    static void CSort (int[] array) {
        int i = 0;
        while (i < array.length) {
            int correct = array[i] - 1;
            if (array[i] != correct) {
                swap(array, i, i - 1);
            } else {
                break;
            }
        }
    }
    static void swap (int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
