import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {

        Random A = new Random();
        Scanner b = new Scanner(System.in);

        int Developer = 0;
        int Player = 0;

        System.out.println("Let's play ROCK PAPER SCISSOR");

        for (int i = 0; i <20; i++) {
            System.out.println("Round no."+(i+1));
            System.out.println("Press 1 : ROCK   2 : PAPER   3 : SCISSOR");
            int a = b.nextInt();

            while(a <= 0 || a >= 4){
                    System.out.println("Please enter a valid input");
                    a = b.nextInt();
                }

            if (a == 1 ) {
                System.out.println("ROCK");
            } else if (a == 2) {
                System.out.println("PAPER");
            } else {
                System.out.println("SCISSOR");
            }

            int c = A.nextInt(3);
            if (c == 0) {
                System.out.println("ROCK");
            } else if (c == 1) {
                System.out.println("SCISSOR");
            } else {
                System.out.println("PAPER");
            }

//        ---------------------------------------------------------------------------------------------------------
            if (a == 1 && c == 0 || a == 2 && c == 2||a == 3 && c == 1) {
                System.out.println("Match tied\n");
            } else if (a == 1 && c == 1|| a == 2 && c == 0|| a == 3 && c == 2) {
                System.out.println("You won\n");
                Player++;
            } else {
                System.out.println("Developer won\n");
                Developer++;
            }
            if(Developer==5||Player==5){
                break;
            }
        }
        System.out.println("GAME OVER");
        System.out.println("Final Scores\nDeveloper's score : "+Developer+"    Your score : "+Player);
        if(Developer>Player){
            System.out.print("Developer won the match by a lead of "+(Developer-Player)+" point");
            if(Developer-Player>1) {
                System.out.println("s");
            }
        }
        else if (Developer==Player){
            System.out.println("Match tied");
        }
        else{
            System.out.print("You won the match by a lead of "+(Player-Developer)+" point");
            if(Player-Developer>1) {
                System.out.println("s");
            }
        }
    }
}
