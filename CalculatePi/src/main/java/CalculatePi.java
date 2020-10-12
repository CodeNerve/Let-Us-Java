import java.util.Scanner;

public class CalculatePi {

    Scanner s = new Scanner(System.in);
    double res = 0;

    public CalculatePi(){
        System.out.println("Enter the input number");
        int n = s.nextInt();
        res = calculate(n);
        System.out.println(res);
    }

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

        CalculatePi calculatePi = new CalculatePi();

        //System.out.println("Enter the input number");
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        //System.out.println(calculatePi.calculate(n));
    }
}
