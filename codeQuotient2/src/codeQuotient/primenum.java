package codeQuotient;

import java.util.Scanner;

public class primenum {
	 public static void main(String[] args)
	    {
	        // Write your code here
	      Scanner inp = new Scanner(System.in);
	      int n = inp.nextInt();
	      int m = inp.nextInt();
	      boolean isPrime = true;
	      int c=0;
	      
	      for(int i=2;i<=n;i++)
	      { isPrime=true;
	        for(int j=2;j<=i/2;j++)
	        {
	          if(i%j==0)
	          {
	            isPrime = false;
	            break;
	          }
	        }
	       if(isPrime)
	       {
	         c++;
	         if(c<=m)
	         System.out.println(i);
	       }
	      }
	    }
	}
