import java.util.Scanner;

public class ArmstrongNum {

	/* driver function commented
  public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();

		int k = length(N);

		System.out.println(isArmstrongNumber(N, k));

		kb.close();
	}
  */

	public static int length(int N) {
		int length = 0;

		while (N != 0) {
			N = N / 10;
			length++;
		}

		return length;
	}

	public static boolean isArmstrongNumber(int N, int k) {
		long powerSum = 0;
		int n = N;

		while (n != 0) {
			int rem = n % 10;

			powerSum += (int) Math.pow(rem, k);

			n /= 10;
		}
		System.out.println(powerSum);
		return (powerSum==N);
	}

}
