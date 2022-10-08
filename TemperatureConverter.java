import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius, fahrenheit;

        Scanner read = new Scanner(System.in);

        System.out.println("Enter a temperature in Celsius to be converted to Fahrenheit: ");
        celsius = read.nextDouble(); //if you want to put a not integer number use virgula. ex: 18,3

        fahrenheit = (9*celsius+160)/5; // Fahrenheit formula

        System.out.println(celsius+" degrees Celsius = "+fahrenheit+" degrees Fahrenheit");


    }
}
