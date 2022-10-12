import java.util.*;
class Power 
{
    static double power(int n, int P)
    {
        if (P == 0)
            return 1;
        else if(P>0)
            return n * power(n, P - 1);
        else
            return 1.0/n*power(n,P+1);
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,P;
        System.out.println("Enter the Number: ");
        n=sc.nextInt();
        System.out.println("Enter the power: ");
        P=sc.nextInt();
        System.out.println("The power is: "+power(n, P));
    }
}