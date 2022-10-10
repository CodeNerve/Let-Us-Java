import java.util.Scanner;

class SpecialNumber {
    public static void main(String args[]) {
        int num, number, last_digit, sum_Of_Fact = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        num = number;
        while (number > 0) {
            last_digit = number % 10;
            int fact = 1;
            for (int i = 1; i <= last_digit; i++) {
                fact = fact * i;
            }
            sum_Of_Fact = sum_Of_Fact + fact;
            number = number / 10;
        }
        if (num == sum_Of_Fact) {
            System.out.println(num + " is a special number.");
        } else {
            System.out.println(num + " is not a special number.");
        }
    }
}