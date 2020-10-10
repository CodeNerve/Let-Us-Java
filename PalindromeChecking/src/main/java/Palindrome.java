import java.io.*;
public class Palindrome{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number :");
		int n = Integer.parseInt(br.readLine());

		int temp = n;
		int sum =0;
		while(n>0){
			int r = n%10;
			sum = (sum*10)+r;
			n=n/10;
		}
		if(temp == sum){
			System.out.println("The input is a palindrome number.");
		}else{
			System.out.println("The input is not a palindrome number.");
		}


	}
}
