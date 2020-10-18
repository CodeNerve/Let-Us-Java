
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{n=n/2;
		int i=2,k=0;
		    while (k!=n)
		    {int s=0;
		        for(int j=2;j<i;j++)
		        {
		            if(i%j==0)
		            {
		                s=1;
		                break;
		            }
		        }
		        if(s==1)
		        {
		            i++;
		        }
		        else
		        {
		            k++;
		            i++;
		        }
		  }
		  System.out.println(i-1);
		}
		else{
		    n=n/2+1;
		    double phi = (1 + Math.sqrt(5)) / 2; 
            int fibo= (int) Math.round(Math.pow(phi, n)  
                        / Math.sqrt(5));
		    System.out.println(fibo);
		}
	}
}
		
		    