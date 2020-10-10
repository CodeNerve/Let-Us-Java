/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
    static class query
	{
		int start, end;

		query(int start, int end)
		{
			this.start = start;
			this.end = end;
		}
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader sc=new FastReader();
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[n];
		    int c[]=new int[n];
		    int lo[]=new int[n];
		    int u[]=new int[n];
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		        c[j]=0;
		        lo[j]=j-a[j];
		        if(lo[j]<0)
		        lo[j]=0;
		        u[j]=j+a[j];

		    }
		    for(int j=0;j<n;j++)
		    {
		        b[j]=sc.nextInt();
		    }

		query[] q_arr = new query[n];
		for(int j=0;j<n;j++){
		q_arr[j] = new query(lo[j], u[j]); }
		int d = 1;
		increment(c, q_arr, n, n, d);
		    boolean ans= check(b,c);
		    if(ans==true)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static boolean check(int b[], int c[])
    {
        int n = b.length;
        int m = c.length;
        if (n != m)
            return false;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(b[i]) == null)
                map.put(b[i], 1);
            else {
                count = map.get(b[i]);
                count++;
                map.put(b[i], count);
            }
        }
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(c[i]))
                return false;
            if (map.get(c[i]) == 0)
                return false;

            count = map.get(c[i]);
            --count;
            map.put(c[i], count);
        }
        return true;
    }

    public static void increment(int[] arr, query[] q_arr,
									int n, int m, int d)
	{
		int[] sum = new int[n];
		for (int i = 0; i < m; i++)
		{
			sum[q_arr[i].start] += d;
			if ((q_arr[i].end + 1) < n)
				sum[q_arr[i].end + 1] -= d;
		}
		arr[0] += sum[0];
		for (int i = 1; i < n; i++)
		{
			sum[i] += sum[i - 1];
			arr[i] += sum[i];
		}
	}
}
