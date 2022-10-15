package Arrays;
import java.util.Scanner;
public class KadaneAlgo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int n =sc.nextInt();
        int a []=new int[n];
        for(in i =0;i<n;i++){
        a[i]=sc.nextInt();
        }
        System.out.println(kadaneAlgo(a));
    }

    public static int kadaneAlgo(int[] arr){
        int max = arr[0], sum = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            len++;
            if (sum > max) {
                max = sum;
            }
            if (sum <= 0) {
                sum = 0;
                len = 0;
            }
        }
        return len;
    }
}
