import java.util.Scanner;

public class WorkingWeek {

  static int min(int a, int b) {
    return (a <= b) ? a : b;
  }

  static int abs(int a) {
    if (a < 0) {
      return -1 * a;
    } else {
      return a;
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();

    int res[] = new int[t];
    int c1, c2, c3, l1, l2, l3, n, m;
    for (int i = 0; i < res.length; i++) {
      n = scan.nextInt();
      c3 = n;
      c1 = n / 3;
      c2 = c1 + 2;
      l1 = c1 - 1;
      l2 = 1;
      l3 = c3 - c2 - 1;

      m = min(abs(l1 - l2), abs(l2 - l3));
      m = min(m, abs(l1 - l3));
      res[i] = m;
    }

    for (int i = 0; i < res.length; i++) {
      System.out.println(res[i]);
    }
  }
}
