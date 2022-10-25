import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = read.nextLine();
        String reverse = "";

        System.out.println();
        for (int x = word.length()-1; x >=0; x--){
            reverse += word.charAt(x);
        }
        if (reverse.equals(word)){
            System.out.println("Correct! "+reverse+" is a palindrome of "+word);
        }
        else {
            System.out.println("Wrong!! The reverse of this word is "+reverse);
        }

    }
}
