import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Pangram {
    public static void main(String[] args) {
        char[] letters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
        's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        ArrayList<String> charsOfSentence = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String sentence;
        StringBuilder distinctStringBuilder = new StringBuilder();
        StringBuilder lowerCaseStringBuilder = new StringBuilder();


        System.out.println("Please give a sentence: ");
        sentence = in.nextLine();

        //seperates the non alphabetic characters 
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isAlphabetic(sentence.charAt(i))) {
                lowerCaseStringBuilder.append(String.valueOf(sentence.charAt(i)).toLowerCase());
            }
        }
        //makes the characters lower case
        lowerCaseStringBuilder.chars().distinct().forEach(c -> distinctStringBuilder.append((char) c));

        //fills a list with all characters so they can be sorted
        for (int i = 0; i < distinctStringBuilder.length(); i++) {
            charsOfSentence.add(String.valueOf(distinctStringBuilder.charAt(i)));
        }
        Collections.sort(charsOfSentence);

        if (charsOfSentence.toString().equals(Arrays.toString(letters))){
            System.out.println("Sentence is pangram");
        }

        else {
            System.out.println("Sentence is not pangram");
        }
    }
}
