import java.util.*;
public class RotatedBinaryRecusion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int target=in.nextInt();
        System.out.println(RotatedBinary(arr, target, 0, arr.length-1));
        in.close();
    }
    static int RotatedBinary(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                return RotatedBinary(arr, target, start, mid-1);
            }
            else{
                return RotatedBinary(arr, target, mid+1, end);
            }
        }
        if(target>arr[mid] && target<arr[end]){
            return RotatedBinary(arr, target, mid+1, end);
        }
        else
        {
            return RotatedBinary(arr,target,start,mid-1);
        }
    }
}
