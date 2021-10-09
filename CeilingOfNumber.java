public class CelilingNumber {
    public static void main(String[] args) {
        int []arr={3,6,7,9,12,15,17,18,22,27};
        int target=16;
       int result= BinarySearch(arr,target);
        System.out.println(result);
    }

     static int BinarySearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        if(target>arr[arr.length-1])
            return -1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target < arr[mid]){
                end=mid-1;
            }
            else if(target > arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
         return start;

    }
}
