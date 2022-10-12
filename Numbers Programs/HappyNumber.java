/*
Java program to check whether a number is a Happy Number or Not
In number theory, a Happy Number is a number which eventually
reaches 1 when replaced by the sum of the square of each digit.
*/
import java.util.*;
public class HappyNumber {
    static boolean isHappyNumber(int n)
    {
        Set<Integer> unique_num = new HashSet<Integer>();
        while (unique_num.add(n))
        {
            int value = 0;
            while (n > 0)
            {
                value += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = value;
        }
        return n == 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(isHappyNumber(n))
        {
            System.out.println("Happy Number!");
        }
        else
        {
            System.out.println("Not a Happy Number!");
        }
    }
}