/**
 * Author:  Soumen Roy
 * Date:    11 October 2021 (Monday)
 */
public class NthMagicNumber {

	public static void main(String[] args) {
        //Magic numbers are as follows : 5, 25, 30, 125,....
		//They are calculated as follows:
		//1st Magic Number = write 1 in binary and take five raised to the digit's position having 1, for eg: 001 and 5^1 = 5
		//2nd Magic Number = write 2 in binary and take five raised to the digit's position having 1, for eg: 010 and 5^2 for = 25, note digit 1 was present in the 2nd position		
		
		int result = magic(1);
		System.out.println(result); //Input=4, Output=125
	}
	
	public static int magic(int n) {
		int last=0,i=1, product=0;
		
		while(n>0) {
			last = n & 1; // And operation with 1, fetches the last digit of a number in binary form(Ultimately everything is binary for Computers), for e.g 100 & 001 = 000 and 000 is nothing but 0
			product = product + (int)(Math.pow(5,i)*last);
			n=n >> 1; // right shift removes the last digit
			i++;
		}
		return product;
	}

}
