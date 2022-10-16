import java.util.Scanner;

public class cmpareReverse {


public static void main (String[] args) {
	//code
	 Scanner sc=new Scanner(System.in);
	 int T=sc.nextInt();
	 while(T!=0)
	 {
	     long n=sc.nextLong(),rev,sum=0;
	     long x=n;
	     while(n!=0)
	     {
	         rev=n%10;
	         sum=sum*10+rev;
	         n/=10;
	     }
	     if(x==sum)
		     System.out.println("Equal");

	     else
		     System.out.println("Not Equal");
	     T--;
	 }
  }
}
