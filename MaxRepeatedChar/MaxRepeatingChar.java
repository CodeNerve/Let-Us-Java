package main.java.strings;

import java.util.Scanner;

public class MaxRepeatingChar {

  static char findMaxRepeatingChar(String str) {
    int len = str.length();
    int count = 0;

    char ch = str.charAt(0);
    for (int i = 0; i < len; i++) {
      int current_count = 1;
      for (int j = i + 1; j < len; j++) {
        if (str.charAt(i) != str.charAt(j))
          break;
        current_count++;
      }

      if (current_count > count) {
        count = current_count;
        ch = str.charAt(i);
      }
    }
    return ch;
  }

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    System.out.println(findMaxRepeatingChar(str));
  }
}
