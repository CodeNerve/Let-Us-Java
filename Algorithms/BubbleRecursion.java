import java.util.Arrays;

/**
 * BubbleRecursion
 */
public class BubbleRecursion {

    public static void main(String[] args) {
        int[] arr={6,3,2,9,99};
        System.out.println(Arrays.toString(bubbles(arr, arr.length-1, 0)));
    }
    static int[] bubbles(int[] arr,int r,int c){
        if(r==0){
            return arr;
        }
     if(c<r){
        if(arr[c]>arr[c+1]){
            int temp=arr[c];
            arr[c]=arr[c+1];
            arr[c+1]=temp;
        }
        return bubbles(arr, r, c+1);
     }
     else{
       return bubbles(arr, r-1, 0);
     }
    }
}
