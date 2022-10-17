import java.util.Scanner;

public class GuessNumber {


	public static void
	guessNumber()
	{
		Scanner sc = new Scanner(System.in);

		int number = 1 + (int)(100 * Math.random());

		int N = 9;

		int i, guess;

		System.out.println(
			"A number is chosen"
			+ " between 1 to 100."
			+ "Guess the number"
			+ " within 9 trials.");

		for (i = 0; i < N; i++) {

			System.out.println(
				"Guess the number:");

			
			guess = sc.nextInt();

			
			if (number == guess) {
				System.out.println("Congratulations!"+ " You guessed the number.");
				break;
			}
			else if (number > guess
					&& i != N - 1) {
				System.out.println("The number is "+ "greater than " + guess);
			}
			else if (number < guess
					&& i != N - 1) {
				System.out.println("The number is"+ " less than " + guess);
			}
		}

		if (i == N) {
			System.out.println("You have exhausted"+ " K trials.");

			System.out.println("The number was " + number);
		}
	}


	public static void main(String arg[])
	{
		guessNumber();
	}
}
