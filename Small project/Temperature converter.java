import java.util.Scanner;

public class Temperature_converter {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("This is temperature converting programme");
        System.out.println("Choose from following categories");
        System.out.println("Press \n1 : Celsius to Fahrenheit   2 : Celsius to Kelvin");
        System.out.println("3 : Kelvin to Celsius       4 : Fahrenheit to Celsius");
        System.out.println("5 : Kelvin to Fahrenheit    6 : Fahrenheit to Kelvin");
        int a = A.nextInt();
        if (a <=0 || a >= 7){
            System.out.println("Please enter a valid input");
            a = A.nextInt();
        }
        System.out.println("Enter the temperature");
        float b = A.nextFloat();
        if (a == 1) {
                System.out.println("Temperature converted\n" + ((b * 9f / 5f) + 32f) + "°F");
            } else if (a == 2) {
                System.out.println("Temperature converted\n" + (b + 273) + "°K");
            } else if (a == 3) {
                System.out.println("Temperature converted\n" + (b - 273) + "°C");
            } else if (a == 4) {
                System.out.println("Temperature converted\n" + ((b-32f)*5f/9f) + "°C");
            } else if (a == 5) {
                System.out.println("Temperature converted\n" + (((b - 273.15f) * 9f / 5f) + 32f) + "°F");
            } else {
                System.out.println("Temperature converted\n" + (((b - 32f) * 5f / 9f) + 273.15f)+"°K");
            }
        }
    }

