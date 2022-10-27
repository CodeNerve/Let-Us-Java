import java.util.Scanner;

public class Multiplication {
    public static void main (String[] args) {
        int number, x=1, result;

        Scanner read = new Scanner(System.in);

        System.out.print("Choose a number to see the multiplication tables: ");
        number = read.nextInt();

        do {
            result = number*x;
            System.out.println(number+" x "+x+" = "+result);
            x++;
        }while (x<=10);
    }
}
