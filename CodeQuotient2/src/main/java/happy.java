import java.util.*;
class happy
{
    int sum;
    int n;
    happy()
    {
        n=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    int sum_sqdigits(int n)
    {
        if(n==0)
        return 0;
        else
        {
            int t=n%10;
            return((t*t)+sum_sqdigits(n/10));
        }
    }
    void ishappy()
    {
        while(n>9)
        {
            n=sum_sqdigits(n);
        }
        if(n==1)
        System.out.println("the number is happy");
        else
        System.out.println("the number is not happy");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        int num=sc.nextInt();
        happy obj=new happy();
        obj.getnum(num);
        obj.ishappy();
    }
}
