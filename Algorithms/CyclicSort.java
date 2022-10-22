package Sorting;
import java.util.Arrays;
import java.util.Scanner;
public class CyclicSort {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();}
		cycle(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void cycle(int arr[]) {
		int i=0;
		while(i<arr.length)
		{
			int correct=arr[i]-1;
			if(arr[i]!=arr[correct])
			{
				int temp=arr[i];
				arr[i]=arr[correct];
				arr[correct]=temp;
			}
			else
			{
				i++;
				
			}
		}
	}

}
