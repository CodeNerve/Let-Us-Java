public class ceilValue {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 5, 7, 9 };

        System.out.println(ceil(arr, 3));
        System.out.println(ceil(arr, 6));
        System.out.println(ceil(arr, 10));
        System.out.println(ceil(arr, 0));
        System.out.println(ceil(arr, 8));
    }

    static int ceil(int arr[], int k) {
        int left = 0;
        int right = arr.length - 1;
        int cel = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == k) {
                return arr[mid];
            } else if (arr[mid] < k) {

                left = mid + 1;
            } else {
                cel = arr[mid];
                right = mid - 1;
            }
        }
        return cel;
    }
}
