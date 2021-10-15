package Sorting;


public class CountingSort implements InPlaceSort {

    // Sort values in the range of [minVal, maxVal] in O(n+maxVal-maxVal)
    private static void countingSort(int[] ar, int minVal, int maxVal) {
        int sz = maxVal - minVal + 1;
        int[] b = new int[sz];
        for (int j : ar) b[j - minVal]++;
        for (int i = 0, k = 0; i < sz; i++) {
            while (b[i]-- > 0) ar[k++] = i + minVal;
        }
    }

    public static void main(String[] args) {
        CountingSort sorter = new CountingSort();
        int[] nums = {+4, -10, +0, +6, +1, -5, -5, +1, +1, -2, 0, +6, +8, -7, +10};
        sorter.sort(nums);

        // Prints:
        // [-10, -7, -5, -5, -2, 0, 0, 1, 1, 1, 4, 6, 6, 8, 10]
        System.out.println(java.util.Arrays.toString(nums));
    }

    @Override
    public void sort(int[] values) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int value : values) {
            if (value < minValue) minValue = value;
            if (value > maxValue) maxValue = value;
        }
        CountingSort.countingSort(values, minValue, maxValue);
    }
}