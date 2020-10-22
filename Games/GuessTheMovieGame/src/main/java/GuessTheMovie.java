import java.util.*;
public class GuessTheMovie {
	Movie movie = new Movie();
	boolean hasWon = false;
	StringBuffer output = new StringBuffer("");
	StringBuffer name = new StringBuffer(movie.name);
	Scanner s = new Scanner(System.in);
	int wrongLettersCount = 0;
	String wrongLetters = "";

	public GuessTheMovie() {
		for(int i = 0;i < movie.length;i++) {
			if(movie.name.charAt(i) == ' ') {
				output.insert(i," ");
				continue;
			}
			output.insert(i,"_");
		}
		System.out.println("Number of Letters in the movie are " + movie.length);
	}

	public void play() {
		printMessage();
		String letter = takeInput();

		while(hasAlreadyGuessedLetter(letter)) {
			System.out.println("You have Already Guessed Letter " + letter + 
					"\nGuess another letter:");
			letter = s.nextLine();
		}

		checkGuess(letter);
		checkResult();

	}

	public boolean gameOver() {
		if(hasWon) {
			System.out.println("Congratulations \nYou Win! \nYou have guessed " + 
					movie.name + " correctly");
			return true;
		}
		if(wrongLettersCount == 10) {
			System.out.println("Oops You Lost! \nThe movie was " + 
					movie.name + "\nBetter Luck next time");
			return true;
		}
		return false;
	}

	private void printMessage() {
		System.out.println("You are guessing: " + output + 
				"\nYou have (" + wrongLettersCount + ") wrong letters:" + wrongLetters + 
				"\nGuess a letter:");
		
	}

	private String takeInput() {
		return s.nextLine();
	}

	private boolean hasAlreadyGuessedLetter(String letter) {
		if(wrongLetters.indexOf(letter) != -1) {
			return true;
		}
		return false;
	}

	private void checkGuess(String letter) {
		if(name.indexOf(letter) != -1) {
			output.replace(name.indexOf(letter),name.indexOf(letter) + 1,letter);
			name.replace(name.indexOf(letter),name.indexOf(letter) + 1,"$");
		}
		else {
			wrongLetters = wrongLetters + " " + letter;
			wrongLettersCount++;
		}
	}

	private void checkResult() {
		if(output.indexOf("_") == -1) {
			hasWon = true;
		}
	}

}
