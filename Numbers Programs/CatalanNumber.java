/*
Java program to print the Nth Catalan Number
In combinatorial mathematics, the Catalan numbers are a sequence of natural numbers
that occur in various counting problems,
often involving recursively defined objects.
*/
import java.util.*;
public class CatalanNumber {
    static int Catalan(int n)
    {
        int res = 0;

        // Base case
        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Catalan Number is: "+Catalan(n));
    }
}