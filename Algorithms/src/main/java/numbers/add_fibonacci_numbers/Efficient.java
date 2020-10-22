package numbers.add_fibonacci_numbers;

import java.io.*;
import java.util.*;

public class Efficient { 
    static int MAX = 1000;


    static int f[] = new int[MAX];


    static int fib(int n)
    {
        Arrays.fill(f, 0);
        // Base cases
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return (f[n] = 1);

        // If fib(n) is already computed
        if (f[n] == 1)
            return f[n];
            int k;
        if((n & 1) == 1)
            k = (n + 1) / 2 ;
        else
            k = n / 2;

        if((n & 1) == 1)
            f[n] = (fib(k) * fib(k) +
            fib(k - 1) * fib(k - 1));
        else
            f[n] = (2 * fib(k - 1) + fib(k)) * fib(k);

        return f[n];
    }

    static int calculateSum(int n)
    {
        return fib(n + 2) - 1;
    }


    public static void main(String args[])
    {
        int n = 4;
        System.out.println( "Sum of Fibonacci numbers is : " + calculateSum(n));

    }
}
