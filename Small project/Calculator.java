import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        float ans;
        while (true) {
        System.out.print("Enter the operation: ");
        char c = A.next().trim().charAt(0);
        if (c == '+' || c == '-' || c == '/' || c == '*' || c == '%') {
                System.out.println("Enter first number");
                float a = A.nextFloat();
                System.out.println("Enter second number");
                float b = A.nextFloat();
                if (c == '+') {
                    ans = a + b;
                    System.out.println("The answer is " + ans);
                } else if (c == '-') {
                    ans = a - b;
                    System.out.println("The answer is "+ans);
                } else if (c == '*') {
                    ans = a * b;
                    System.out.println("The answer is "+ans);
                } else if (c == '/') {
                    ans = a / b;
                    System.out.println("The answer is "+ans);
                } else{
                ans = a % b;
                System.out.println("The answer is "+ans);
            }

        }else if(c=='x'||c=='X'){
            break;
        }
        else{
            System.out.println("invalid input");
        }
        }
    }
}
