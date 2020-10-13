package codeQuotient;

import java.util.Scanner;

public class sumofn {
	 public static void main(String[] args)
	    {
	        // Write your code here
		 Scanner s= new Scanner(System.in);
		 int n=s.nextInt();
		 int sum=0;
		 for(int i=0;i<=n;i++) {
			 sum+=i;
		 }
		 System.out.println(sum);
	    }
}
