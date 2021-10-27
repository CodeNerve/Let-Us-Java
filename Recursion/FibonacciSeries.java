import java.util.Scanner;

public class FibonacciSeries{
	static int num1=0,num2=1,num3=0;
	static void fibonacci(int n){
		if(n>0){
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(" "+num3);
			fibonacci(n-1);
		}
	}
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for which you want to find the Fibonacci Series: ");
		//taking input from the user
		int n = scanner.nextInt();
		System.out.print(num1+" "+num2);//printing constant first two digits 0 and 1
		fibonacci(n-2);//Since first two numbers are already done
	}
}