// 2.	Write java program to display Fibonacci series up to a limit.

import java.io.*;

public class lab2{
	public static void main (String [] Args) throws IOException{
	int first =0,second=1;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the Limit");
	int limit = Integer.parseInt(br.readLine());
	System.out.println("Fibonacci Series is .......");
	System.out.println(first);
	System.out.println(second);
	int a = 1;
	int b;
	for (int i=1;i<limit;i = b+a){
		System.out.println(i);
		b = a;
		a = i;
	}
	}
	
}
