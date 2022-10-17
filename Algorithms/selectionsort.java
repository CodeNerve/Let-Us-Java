import java.util.Arrays;

class SelectionSort {
  void selectionSort(int array[]) {
    int size = array.length;

    for (int i = 0; i < size - 1; i++) {
      int min_idx = i;

      for (int j = i + 1; j < size; j++) {

        if (array[j] < array[min_idx]) {
          min_idx = j;
        }
      }

      int tem = array[step];
      array[i] = array[min_idx];
      array[min_idx] = tem;
    }
  }

  public static void main(String args[]) {
    int[] data = { 20, 12, 10, 15, 2 };
    SelectionSort s = new SelectionSort();
    s.selectionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}
