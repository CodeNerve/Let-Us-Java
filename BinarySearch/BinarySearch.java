package interview;
//works only in sorted array
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,4,5,7,9};
        int target = 9;

        System.out.println(Bsearch(arr,target));

    }

    private static int Bsearch(int[] arr, int tar)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start<=end)
        {
            int mid = start + (end - start)/2; // thsi is used to avoid overflow conditions
            if (arr[mid] == tar)return mid;
            else if (arr[mid] > tar)end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
