import java.io.*;

import java.util.Scanner;

class ABHI {
	public static void main(String[] args)
	{
		int num, rem;
		int rev = 0, sum = 0;
		System.out.println("Enter the number: 25 ");
		num = 25;
        do {
			rem = num % 10;
			rev = rev * 10 + rem;
			sum = sum + rem;
			num = num / 10;
		}
		while (num > 0);
		System.out.println("Reverse of given number: "
						+ rev);
		System.out.println("Sum of digits of given number: "
						+ sum);
	}
}
