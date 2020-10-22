import java.util.Scanner;

class LCM {
    public static void main(String arg[]) {
        long a, b, lcm;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  number 1");
        a = sc.nextLong();
        System.out.println("enter  number 2");
        b = sc.nextLong();
        lcm = lcmCalculation(a, b);
        System.out.println("LCM of " + a + " and " + b + " is =" + lcm);
    }
    static long lcmCalculation(long n1, long n2) {
        long temp, i = 2, res;
        if (n1 > n2)
            res = n1;
        else
            res = n2;
        temp = res;
        while (res % n1 != 0 || res % n2 != 0) {
            res = temp * i;
            i++;
        }
        return res;

    }
}
