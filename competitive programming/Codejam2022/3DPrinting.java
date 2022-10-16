//This Program is the solution for the problem 3D - Printing as asked in the Google Codejam 2022


import java.util.*;

class Solution

{

    public static int fun(int a, int b, int c)

    {

        if(a<=b && a<=c)

        {

            return a;

        }

        else if(b<=a && b<=c)

        {

            return b;

        }

        else

        {

            return c;

        }

    }

    

	public static void main(String[] args) {		Scanner input=new Scanner(System.in);

		int t=input.nextInt();

		ArrayList<Integer> al=new ArrayList<>();

		for(int x=0;x<t;x++)

		{

		    for(int i=0;i<3;i++)

		    {

		        int c=input.nextInt();

    		    int m=input.nextInt();

    		    int y=input.nextInt();

    		    int k=input.nextInt();

    		    al.add(c);

    		    al.add(m);

    		    al.add(y);

    		    al.add(k);

		    }

		    int resC=fun(al.get(0),al.get(4),al.get(8));

		    int resM=fun(al.get(1),al.get(5),al.get(9));

		    int resY=fun(al.get(2),al.get(6),al.get(10));

		    int resK=fun(al.get(3),al.get(7),al.get(11));

		    

		  //  System.out.println(resC);

		  //  System.out.println(resM);

		  //  System.out.println(resY);

		  //  System.out.println(resK);

		    ArrayList<Integer> al1=new ArrayList<>();

		    System.out.print("Case #"+(x+1)+": ");

		    if(resC+resM+resY+resK==1000000)

		    {

		        System.out.print(resC+" "+resM+" "+resY+" "+resK);

		    }

		    

		    else if(resC+resM+resY+resK>1000000)

		    {

		        int arrNew[]=new int[4];

		        arrNew[0]=resC;

		        arrNew[1]=resM;

		        arrNew[2]=resY;

		        arrNew[3]=resK;

                int res=0,i=0;

                ArrayList<Integer> all=new ArrayList<>();

                while(res<1000000)

                {

                    res+=arrNew[i];

                    i+=1;

                }

                if(res==1000000)

                {

                    for(int j=0;j<i;j++)

                    {

                        all.add(arrNew[j]);

                    }

                }

                else

                {

                    for(int j=0;j<i-1;j++)

                    {

                        all.add(arrNew[j]);

                    }

                    int sum=0;

                    for(int j=0;j<i-1;j++)

                    {

                        sum+=arrNew[j];

                    }

                    all.add(1000000-sum);

                }

                int nZero=4-all.size();

                for(int j=0;j<nZero;j++)

                {

                    all.add(0);

                }

                for(int j=0;j<all.size()-1;j++)

                {

                    System.out.print(all.get(j)+" ");

                }

                System.out.println(all.get(all.size()-1));

		      

		    }

		    else

		    {

		        System.out.print("IMPOSSIBLE");

		    }

		    if(x!=t-1)

		    {

		        System.out.println();   

		    }

		    al.clear();

		    al1.clear();

		    

		}

	}

}
