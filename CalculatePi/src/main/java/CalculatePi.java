import java.util.Scanner;

public class CalculatePi {

    public double calculate(int n){
        double Pi = 0.0;
        for (double i = 1; i < n; i++) {
            Pi += (i % 2 == 0) ? -1 / (2 * i - 1) : 1 / (2 * i - 1);
        }

        System.out.println("Pi we found "+Pi * 4);
        System.out.println("Math.PI is "+Math.PI);

        return Pi * 4;
    }

    public static void main(String[] args){
        System.out.println("Enter the input number");
        CalculatePi calculatePi = new CalculatePi();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(calculatePi.calculate(n));
    }
}
