/**
 * Author:  Soumen Roy
 * Date:    10 October 2021 (Friday)
 */
public class FiboWithFormula {

	//driver method - main
	public static void main(String[] args) {
		int result = fib(10);   // get nth fibonacci number, where n is the input
		System.out.println(result); //output: 55, for the 10th fibonaaci number
	}
	
	//one liner method to calculate the nth fibonacci number and return the same. It works for large numbers where as the recurrsive method doesn't.
	public static int fib(int n) {
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n)) / Math.sqrt(5));
    }

}
