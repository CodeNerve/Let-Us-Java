public class RecursiveSumOfAllNumbers {

  public static void main(String[] args) {
    long sumOfAllNumbers = sumOfAllNumbers(9);
    System.out.println(sumOfAllNumbers);
  }

  /* A recursive Java example to sum all natural numbers up to a given long. */
  public static long sumOfAllNumbers(long number) {
  /* Stop the recursive Java program at zero */
    if (number != 0) {
      return number + sumOfAllNumbers(number - 1);
    } else {
      return number;
    }
  }
}
