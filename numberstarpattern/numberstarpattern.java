import java.util.Scanner;

class Main {
   
   public static void main(String[] args) {
        
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int numStars = 0;
       int row = 1;
       while(row <= n){
           int value = 1;
           while(value <= n - row + 1){
                System.out.print(value);
                value = value + 1;
           } 
           int stars = 1;
           while(stars <= numStars){
               System.out.print("*");
               stars = stars + 1;
           }
           value = n - row + 1;
           while(value >= 1){
               System.out.print(value);
               value = value - 1;
           }
           System.out.println();
           row = row + 1;
           numStars = numStars + 2;
      }
   }
}
