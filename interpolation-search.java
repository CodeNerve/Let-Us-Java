//by - ajay


class Main
{
    // Function to determine if target exists in a sorted array `A` or not
    // using an interpolation search algorithm
    public static int interpolationSearch(int[] A, int target)
    {
        // base case
        if (A == null || A.length == 0) {
            return -1;
        }
 
        // search space is A[left…right]
        int left = 0;
        int right = A.length - 1;
 
        while (A[right] != A[left] && target >= A[left] && target <= A[right])
        {
            // estimate mid
            int mid = left + ((target - A[left])*(right - left)/(A[right] - A[left]));
 
            // key is found
            if (target == A[mid]) {
                return mid;
            }
            // discard all elements in the right search space, including middle element
            else if (target < A[mid]) {
                right = mid - 1;
            }
            // discard all elements in the left search space, including middle element
            else {
                left = mid + 1;
            }
        }
 
        // if the key is found
        if (target == A[left]) {
            return left;
        }
 
        // target doesn't exist in the array
        return -1;
    }
 
    public static void main(String[] args)
    {
        int[] A = {2, 5, 6, 8, 9, 10};
        int key = 5;
 
        int index = interpolationSearch(A, key);
 
        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }
}
