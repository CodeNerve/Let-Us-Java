import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = scan.nextInt();

        int temp = palRec(n,0);

        if(temp == n)
            System.out.printf("%d is a palindrome.",n);
        else
            System.out.printf("%d is not palindrome.",n);
    }

    static int palRec(int n, int temp){
        if(n == 0)
            return temp;
        else
            temp = (temp*10) + (n%10);
            return palRec(n/10 , temp);
    }

}
