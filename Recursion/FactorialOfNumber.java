import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for which you want to find a factorial: ");
		//taking input from the user
		int input = scanner.nextInt();
		System.out.println("Factorial of " + input + "! = "+getMyFactorialNumber(input));
		scanner.close();
	}
	public static long getMyFactorialNumber(int inputNumber) {
		if (inputNumber == 1)//base condition
			return 1;
		return inputNumber * getMyFactorialNumber(inputNumber - 1);//recursive call
	}
}