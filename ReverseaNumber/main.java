class Main {
    public static void main(String[] args) {
  
      int number = 23456, reversed = 0;
      
      System.out.println("Original Number: " + number);
  
      while(number != 0) {
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number /= 10;
      }
      System.out.println("");
      System.out.println("Reversed Number: " + reversed);
    }
  }