import java.util.Scanner;

public class Counterexample {
    public static long gcd(long a, long b)
    {
        long current_gcd = 1;
        for (long d = 2; d <= Math.max(a,b)/2; d++)
        {
            if (a % d == 0 && b % d == 0)
            {
                if (d > current_gcd)
                {
                    current_gcd = d;
                }
            }
        }
        return current_gcd;
    }
    public static boolean isCoPrime(long a,long b)
    {
        if(gcd(a,b)==1)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        long l = scan.nextLong();
        long r = scan.nextLong();
        if(r-l<2)
        {
            System.out.println(-1);
        }
        else if(r-l>=3)
        {
            if(l%2==0)
            {
                System.out.println(l+" "+(l+1)+" "+(l+2));
            }else {
                System.out.println((l+1)+" "+(l+2)+" "+(l+3));
            }
        }
        else {
            if(l%2==0)
            {
                System.out.println(l+" "+(l+1)+" "+r);
            }
            else {
                System.out.println(-1);
            }
        }
    }
}