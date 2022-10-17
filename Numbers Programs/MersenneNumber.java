/*
Java program to check whether a number is a Mersenne Number or Not
In mathematics, a Mersenne number is a number that is in the form of M(n)=2n-1.
Where n is an integer. It is an OEIS sequence A000225.
If n is prime, the corresponding Mersenne number may be prime and the number called Mersenne prime number.
It is an OEIS sequence A000043. It was given the name after the French mathematician Marin Mersenne.
*/

import java.util.*;

public class MersenneNumber {
    static boolean isMersenneNumber(int n) {
        int v = n + 1, power = 0, result = 0;
        for (int i = 0; ; i++) {
            power = (int) Math.pow(2, i);
            if (power > v) {
                break;
            } else if (power == n1) {
                return true;
                result = 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (isMersenneNumber(n)) {
            System.out.println("Mersenne Number!");
        } else {
            System.out.println("Not a Mersenne Number!");
        }
    }
}