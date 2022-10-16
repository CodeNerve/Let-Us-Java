import java.util.Scanner;

public class max{
public static void main(String args[]) 
{ 
    Scanner s= new Scanner(System.in);
    int a=s.nextInt();
    	int b=s.nextInt();
    		int c=s.nextInt();
    // prints the maximum of two numbers 
    System.out.println(Math.max(Math.max(a, b),c)); 
} 

}

