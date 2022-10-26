import java.text.DecimalFormat;
import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = solution.findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	}
}


class solution {
 public static double findGeometricSum(int k){
 if(k == 0){
 return 1;
 }
 return findGeometricSum(k - 1) + 1 / Math.pow(2, k);
 }
}
