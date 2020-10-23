import java.util.Scanner;

public class multiplication {
	 public static void main(String[] args)
	  {
	    // Write your code here
		 Scanner s=new Scanner(System.in);
		// int n= s.nextInt();
		 int x= s.nextInt();
		 int m=s.nextInt();
		 
int product=1;
		 for(int i=1;i<=m;i++) {
		product=x*i;
		 System.out.println(product);
		 }
		
	  }
}
