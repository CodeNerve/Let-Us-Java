
public class Game {

	public static void main(String[] args) {
		System.out.println("Welcome Player! \nLet's get started");
		GuessTheMovie game = new GuessTheMovie();
		while(!game.gameOver()) {
			game.play();
		}

	}

}
