import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
class Hangman
{
    public static void main(String[] args) 
    {
        int chances = 0;
        Set<String> prevGuesses = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word for guesser: ");
        String wordToGuess = input.nextLine().toUpperCase();
        int length = wordToGuess.length();
        char[] wordToGuessChars = wordToGuess.toCharArray(); //creates character array of strings
        char[] censor = wordToGuess.toCharArray();
        System.out.println("Your secret word is: "); // prints an array of chars with the same length as string
        for (int index = 0; index < length; index++) 
       {
            censor[index] = '_ ';
        }
        while (!String.valueOf(censor).equals(wordToGuess)) 
        {
            //Initialize all variables in loop
            boolean correct = false; //lets the user know if the letter is in the word or not
            boolean repeated = false; //check if user guessed the same letter twice
            for (int a = 0; a < length; a++) 
            {
                System.out.print(censor[a]);//prints the censored secret word
            }
            System.out.println();
            System.out.println("Type your guess: ");
            String currentGuess = input.next().toUpperCase().substring(0, 1);
            char currentGuessChar = currentGuess.charAt(0); //gets char data from scanner
            if (prevGuesses.contains(currentGuess))            //checks if user already guessed the letter previously
            {
                System.out.println("You already guessed this letter! Try again. Your previous guesses were: ");
                System.out.println(prevGuesses.stream().reduce("", String::concat));
                repeated = true;
            }
            prevGuesses.add(currentGuess);
            //if the guess is not a duplicated guess, it checks if the guessed letter is in the word
            if (!repeated) 
            {
                int times = 0; //number of times a letter is in the word
                for (index = 0; index < length; index++) 
                {
                    if (wordToGuessChars[index] == currentGuessChar) 
                    {
                        censor[index] = currentGuessChar;  //replaces _ with guessed letter in caps
                        correct = true;
                        times++;
                    }
                }
                if (correct) 
                {
                    System.out.println("The letter " + currentGuessChar + " is in the secret word! There are " + times + " " + currentGuessChar + " 's in the word. Revealing the letter(s): ");
                } 
                else 
                {
                    System.out.println("Sorry, the letter is not in the word. Your secret word:  ");
                }
                System.out.println();
            }
            chances++;
        }
        System.out.println("You guessed the entire word " + wordToGuess.toUpperCase() + " correctly! It took you " + chances + " attempts!");
    }
}
