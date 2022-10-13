import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] array = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(array[i] >= array[k - 1] && array[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
