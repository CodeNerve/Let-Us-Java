
/*Fascinating Number: When a number( 3 digits or more ) is multiplied by 2 and 3, 
and when both these products are concatenated with the original number, 
then it results in all digits from 1 to 9 present exactly once. 
There could be any number of zeros and are ignored*/

import java.util.*;
public class FascinatingNumber
{
    public int Count(int n)
    {
        int c=0;
        while(n!=0)
        {
            c++;
            n/=10;
        }
        return c;
    }
    public void isFas(int y)
    {
        int ctr=0;
        int i;
        int p=y*3;
        int t=y*2;
        String ns=Integer.toString(y);
        String nt=Integer.toString(t);
        String np=Integer.toString(p);
        String c= ns+nt+np;
        System.out.println("Final number:" +c);
        for (i=49;i<=57;i++)
        {
            char ch=(char)i;
            if(c.indexOf(ch)==-1||c.indexOf(ch)!=c.lastIndexOf(ch))
            break;
            
            }
       
        if(i==58)
        {
            System.out.print("yes");
        }
        else 
        System.out.print("no");
    }
    public static void main(String args[])
    {
        FascinatingNumber ob = new FascinatingNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(ob.Count(n)>=3)
            ob.isFas(n);
        else
            System.out.println("Number must have 3 or more digits");
    } 
}