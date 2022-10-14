/*
Java program to check whether a number is a Perfect Number or Not
A number whose sum of factors (excluding the number itself) is equal to the number 
is called a perfect number. In other words, 
if the sum of positive divisors (excluding the number itself) of a number equals the number itself is called a perfect number.
*/
import java.util.*;
public class PerfectNumber {
    static boolean isPerfectNumber(int n)
    {     
     long k=n;
     long sum=0;    
     for(int i=1; i <= n/2; i++)  
     {  
     if(n % i == 0)  
     {     
     sum=sum + i;  
     }  
     }  
     return sum==k;   
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(isPerfectNumber(n))
        {
            System.out.println("Perfect Number!");
        }
        else
        {
            System.out.println("Not a Perfect Number!");
        }
    }
}
