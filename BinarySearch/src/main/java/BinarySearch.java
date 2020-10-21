public class BinarySearch {

    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7};
        int key = 4;
        int left = 0;
        int right = numbersArray.length - 1;

        System.out.println("Found on index: " + binarySearch(numbersArray, key, left, right));
    }

    public static int binarySearch(int[] array, int elem, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (elem == array[mid]) {
                return mid;
            } else if (elem < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
