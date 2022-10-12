// Merge two arrays and sort the resulted array

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number of elements in first array : ");
		int n1 = s.nextInt();
		int first[] = new int[n1];

		System.out.print("Enter the elements into first array : ");
		for (int i = 0; i < n1; i++) first[i] = s.nextInt();

		System.out.print("Enter the number of elements in second array : ");
		int n2 = s.nextInt();
		int second[] = new int[n2];

		System.out.print("Enter the elements into second array : ");
		for (int i = 0; i < n2; i++) second[i] = s.nextInt();

		int result[] = new int[n1 + n2];
		int index = 0;
		
		for (int item : first)
			result[index++] = item;

		for (int item : second)
			result[index++] = item;

		Arrays.sort(result);

		System.out.print("The merged sorted array is : ");
		for (int item : result)
			System.out.print(item + " ");
		System.out.println();
	}
}

// expected output
/* 
Enter the number of elements in first array : 4
Enter the elements into first array : 2 5 3 9
Enter the number of elements in second array : 3
Enter the elements into second array : 8 7 0
The merged sorted array is : 0 2 3 5 7 8 9
*/
