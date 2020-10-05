/* codechef Problem: FANCY Contest: JAN19B*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i=0;i<t+1;i++)
		{
		   int  c=0;
		String s=sc.nextLine();
		if(i==0)
		continue;
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens())
		{
		    String y=st.nextToken();
		    if(y.equals("not"))
		    {c++;
		    break;}
		}
		if(c>0)
		System.out.println("Real Fancy");
		else
		System.out.println("regularly fancy");
	}}
}
