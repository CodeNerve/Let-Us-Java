import java.util.Scanner;

public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int max = Integer.MIN_VALUE;
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
			max = Math.max(a[i],max);
		}
		
		for (int exp = 1; max / exp > 0; exp *= 10) countSort(a, n, exp);
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

	private static void countSort(int[] a, int n, int exp) {
		
		int output[] = new int[n]; 
        int i;
        int count[] = new int[10];
       
        for (i = 0; i < n; i++) count[(a[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        for (i = n - 1; i >= 0; i--) {
            output[count[(a[i] / exp) % 10] - 1] = a[i];
            count[(a[i] / exp) % 10]--;
        }
 
        for (i = 0; i < n; i++)  a[i] = output[i];
	}
}
