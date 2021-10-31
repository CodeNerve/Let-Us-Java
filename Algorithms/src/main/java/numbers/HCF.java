import java.io.*;
import java.util.*;
public class HCF
{
    public static void main(String[] args) throws Exception
    {
        //x and y are the number to find the GCD
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number please");
        int x = sc.nextInt();
        System.out.println("Enter your seocnd number please");
        int y = sc.nextInt();
        int gcd=1;
        //running loop from 1 to the smallest of both numbers
        for(int i =1;i<=x && i <=y;i++)
        {
            //returns true if both conditinos are satisified
            if(x%i==0&& y%i==0)
            //storing the variable i in the variable
            gcd = i;
        }
        //prints the gcd
        System.out.println("GCD of "+x+" and "+y+" is: "+gcd);
        
    }
}