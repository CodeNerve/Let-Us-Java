import java.util.Scanner;

public class ColorBlindness {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    int n;
    String s1;
    String s2;
    int ct = 0;
    int arr[] = new int[t];
    for (int i = 0; i < t; i++) {
      n = scan.nextInt();
      scan.nextLine();
      s1 = scan.nextLine();
      s2 = scan.nextLine();

      for (int j = 0; j < n; j++) {
        if (s1.charAt(j) == 'R' && s2.charAt(j) == 'R') {
          ct++;
        }
        if (s1.charAt(j) == 'B' && s2.charAt(j) == 'B') {
          ct++;
        }
        if (s1.charAt(j) == 'G' && s2.charAt(j) == 'G') {
          ct++;
        }
        if (
          s1.charAt(j) == 'B' &&
          s2.charAt(j) == 'G' ||
          s1.charAt(j) == 'G' &&
          s2.charAt(j) == 'B'
        ) {
          ct++;
        }
      }
      // System.out.println(ct);
      if (ct == n) {
        arr[i] = 1;
      } else {
        arr[i] = 0;
      }
      ct = 0;
    }
    for (int i = 0; i < t; i++) {
      if (arr[i] == 1) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
