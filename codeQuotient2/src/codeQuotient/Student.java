package codeQuotient;

import java.util.Scanner;

import java.util.Scanner;
//Other imports go here
//Do NOT change the class name
class Student
 {

	public static void main(String arg[]) 
	   {cq1(21);}

	   private static void cq1(int y) {
	       int x = y / 10;
	       int z = (x + y);
	       x = cq2(z, y);
	       System.out.println("cq1: x = " + x + ", y = " + y + ", z = " + z);
	   }

	   private static int cq2(int x, int y) {
	       int z = cq3(x + y, y);
	       y /= z;
	       System.out.println("cq2: x = " + x + ", y = " + y + ", z = " + z);
	       return z;
	   }

	   private static int cq3(int x, int y) {
	       y = x / (x % 10);
	       System.out.println("cq3: x = " + x + ", y = " + y);
	       return y;
	   }
}