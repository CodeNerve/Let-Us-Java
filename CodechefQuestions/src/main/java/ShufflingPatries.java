import java.util.*;
class ShufflingPatries
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T--!=0)
		{
		 int i,x,y;
		 int n = sc.nextInt();
		 int[] a=new int[n];
		 for(i=0;i<n;i++)
		 {
		    a[i]=sc.nextInt();
		 }
		 int even = n/2;
		 int odd = n-(n/2);
		
		 int o = 0;
		 int c = 0;
		 for(i=0;i<n;i++)
		 {
		 if(a[i]%2==1)o++;
		 else
	    	 c++;
		 }
		 if(o<even)	 x=o;
		 else x=even;
		 if(c<odd) y=c;
		 else  y=odd;

		System.out.println(x+y);
		    
		}

        sc.close();
		
		
		
	}
	
}