import java.util.Scanner;
 
public class Main {
    
    public static int removingZeros(int num) {
        int index = 0;
        int newNumber = 0;
        int n = num;
        while(n != 0) {
            int d = n % 10;
            if(d != 0) {
                newNumber += (int)(d * Math.pow(10, index));
                index++;
            }
            n /= 10;
        }
        return newNumber;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a + b;
        int newa = removingZeros(a);
        int newb = removingZeros(b);
        int newsum = removingZeros(sum);
        if(newa + newb == newsum) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
