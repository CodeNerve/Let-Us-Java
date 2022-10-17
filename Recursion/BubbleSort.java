import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int r,int c){
        if(r==0){
        return;
        }
        else if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr,r,c+1);
        } 
        else{
            bubble(arr,r-1,0);
        }
    }
    
}
