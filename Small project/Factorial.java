import java.util.Scanner;

public class Factorial {
    public static void main (String[] args){

        int number, factorial;

        Scanner read = new Scanner(System.in);

        System.out.println("Enter the number: ");
        number = read.nextInt();

        factorial = fact(number);
        System.out.println("The factorial number is: "+factorial);
    }
    static int fact(int n) {
        int output;
        if (n==1){
            return 1;
        }
        output = fact(n-1)*n;
        return output;
    }
}
