
// Author: ADARSH
// https://github.com/ADARSH-863


import java.util.Random;
import java.util.Scanner;

// Please edit the class name if it is throwing error.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random index = new Random();
        String ar[][] = new String [3][3];
        int count[][] = new int [2][9];

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                ar[i][j] = "("+i+","+j+")\t";
            }
        }

        System.out.println("\n\nWelcome to the game of Tic Tac Toe...");
        Boolean win = false;
        int c = -1;
        System.out.println("Your symbol is ((X)) and Computer's symbol is ((O)) \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 9; j++) {
                count[i][j] = -5;
            }
        }

        do {
            int z = 0, k=0;
            c++;


            for (int i = 0; i < ar.length; i++) {
                for (int j = 0; j < ar.length; j++) {
                    System.out.print(ar[i][j]+"\t");
                }
                System.out.println("\n\n\n");
            }


            do {

                int y = 0;

                if (c%2 != 0) {
                    System.out.println("Computer's turn:");
                    int a = index.nextInt(3);
                    int b = index.nextInt(3);
                    System.out.println(a+" "+b);
                    for (int i = 0; i < 9; i++) {
                        if (a == count[0][i] && b == count[1][i]) {
                            y++;
                            break;
                        } 
                    }

                    if(y==0) {
                        ar[a][b] = "((O))\t";
                        count[0][c] = a;
                        count[1][c] = b;
                        z++;
                    }

                }
                else {
                    System.out.println("Your turn:");
                    int a = in.nextInt();
                    int b = in.nextInt();
                    for (int i = 0; i < 9; i++) {
                        if (a == count[0][i] && b == count[1][i]) {
                            System.out.println((ar[a][b]=="((X))\t")?"You have alredy occupied this index.":"Computer has already occupied this index.");
                            y++;
                            break;
                        } 
                    }

                    if(y==0) {
                        ar[a][b] = "((X))\t";
                        count[0][c] = a;
                        count[1][c] = b;
                        z++;
                    }

                }
                System.out.println("\n");
            } while (z==0);


            if( ar[0][0]==ar[1][0] && ar[1][0]==ar[2][0] ) {
                win = true;
                if(ar[0][0]=="((O))\t")
                {
                    ar[0][0]="((@))\t";
                    ar[1][0]="((@))\t";
                    ar[2][0]="((@))\t";
                }                
                else
                {
                    ar[0][0]="((#))\t";
                    ar[1][0]="((#))\t";
                    ar[2][0]="((#))\t";
                }      
                for (int i = 0; i < ar.length; i++) {
                    for (int j = 0; j < ar.length; j++) {
                        System.out.print(ar[i][j]+"\t");
                    }
                    System.out.println("\n\n\n");
                }
                System.out.println((ar[0][0]=="((@))\t")?"Computer is the winner!\nBetter luck next time...":"You are the winner!");
            }
            else if ( ar[0][1]==ar[1][1] && ar[1][1]==ar[2][1] ) {
                win = true;
                if(ar[0][1]=="((O))\t")
                {
                    ar[0][1]="((@))\t";
                    ar[1][1]="((@))\t";
                    ar[2][1]="((@))\t";
                }  
                else
                {
                    ar[0][1]="((#))\t";
                    ar[1][1]="((#))\t";
                    ar[2][1]="((#))\t";
                }  
                for (int i = 0; i < ar.length; i++) {
                    for (int j = 0; j < ar.length; j++) {
                        System.out.print(ar[i][j]+"\t");
                    }
                    System.out.println("\n\n\n");
                }
                System.out.println((ar[0][1]=="((@))\t")?"Computer is the winner!\nBetter luck next time...":"You are the winner!");
            }
            else if ( ar[0][2]==ar[1][2] && ar[1][2]==ar[2][2] ) {
                win = true;
                if(ar[0][2]=="((O))\t")
                {
                    ar[0][2]="((@))\t";
                    ar[1][2]="((@))\t";
                    ar[2][2]="((@))\t";
                }  
                else
                {
                    ar[0][2]="((#))\t";
                    ar[1][2]="((#))\t";
                    ar[2][2]="((#))\t";
                } 
                for (int i = 0; i < ar.length; i++) {
                    for (int j = 0; j < ar.length; j++) {
                        System.out.print(ar[i][j]+"\t");
                    }
                    System.out.println("\n\n\n");
                }
                System.out.println((ar[0][2]=="((@))\t")?"Computer is the winner!\nBetter luck next time...":"You are the winner!");
            }
            else if ( ar[0][0]==ar[0][1] && ar[0][1]==ar[0][2] ) {
                win = true;
                if(ar[0][1]=="((O))\t")
                {
                    ar[0][0]="((@))\t";
                    ar[0][1]="((@))\t";
                    ar[0][2]="((@))\t";
                }  
                else
                {
                    ar[0][0]="((#))\t";
                    ar[0][1]="((#))\t";
                    ar[0][2]="((#))\t";
                } 
                for (int i = 0; i < ar.length; i++) {
                    for (int j = 0; j < ar.length; j++) {
                        System.out.print(ar[i][j]+"\t");
                    }
                    System.out.println("\n\n\n");
                }                
                System.out.println((ar[0][0]=="((@))\t")?"Computer is the winner!\nBetter luck next time...":"You are the winner!");
            }
            else if ( ar[1][0]==ar[1][1] && ar[1][1]==ar[1][2] ) {
                win = true;
                if(ar[1][1]=="((O))\t")
                {
                    ar[1][0]="((@))\t";
                    ar[1][1]="((@))\t";
                    ar[1][2]="((@))\t";
                }  
                else
                {
                    ar[1][0]="((#))\t";
                    ar[1][1]="((#))\t";
                    ar[1][2]="((#))\t";
                } 
                for (int i = 0; i < ar.length; i++) {
                    for (int j = 0; j < ar.length; j++) {
                        System.out.print(ar[i][j]+"\t");
                    }
                    System.out.println("\n\n\n");
                }
                System.out.println((ar[1][0]=="((@))\t")?"Computer is the winner!\nBetter luck next time...":"You are the winner!");
            }
            else if ( ar[2][0]==ar[2][1] && ar[2][1]==ar[2][2] ) {
                win = true;
                if(ar[2][1]=="((O))\t")
                {
                    ar[0][0]="((@))\t";
                    ar[0][1]="((@))\t";
                    ar[0][2]="((@))\t";
                }  
                else
                {
                    ar[0][0]="((#))\t";
                    ar[0][1]="((#))\t";
                    ar[0][2]="((#))\t";
                } 
                for (int i = 0; i < ar.length; i++) {
                    for (int j = 0; j < ar.length; j++) {
                        System.out.print(ar[i][j]+"\t");
                    }
                    System.out.println("\n\n\n");
                }
                System.out.println((ar[2][0]=="((@))\t")?"Computer is the winner!\nBetter luck next time...":"You are the winner!");
            }
            else if ( ar[0][0]==ar[1][1] && ar[1][1]==ar[2][2] ) {
                win = true;
                if(ar[0][0]=="((O))\t")
                {
                    ar[0][0]="((@))\t";
                    ar[1][1]="((@))\t";
                    ar[2][2]="((@))\t";
                }  
                else
                {
                    ar[0][0]="((#))\t";
                    ar[1][1]="((#))\t";
                    ar[2][2]="((#))\t";
                } 
                for (int i = 0; i < ar.length; i++) {
                    for (int j = 0; j < ar.length; j++) {
                        System.out.print(ar[i][j]+"\t");
                    }
                    System.out.println("\n\n\n");
                }                
                System.out.println((ar[0][0]=="((@))\t")?"Computer is the winner!\nBetter luck next time...":"You are the winner!");
            }
            else if ( ar[2][0]==ar[1][1] && ar[1][1]==ar[0][2]) {
                win = true;
                if(ar[1][1]=="((O))\t")
                {
                    ar[2][0]="((@))\t";
                    ar[1][1]="((@))\t";
                    ar[0][2]="((@))\t";
                }  
                else
                {
                    ar[2][0]="((#))\t";
                    ar[1][1]="((#))\t";
                    ar[0][2]="((#))\t";
                } 
                for (int i = 0; i < ar.length; i++) {
                    for (int j = 0; j < ar.length; j++) {
                        System.out.print(ar[i][j]+"\t");
                    }
                    System.out.println("\n\n\n");
                }
                System.out.println((ar[1][1]=="((@))\t")?"Computer is the winner!\nBetter luck next time...\nBetter luck next time...":"You are the winner!");
            }

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 9; j++) {
                    if(count[i][j] == -5) {
                        k = -5;
                    }
                }
            }

            if(k==0 && win==false) {
                System.out.println("Match drawn!!!");
                win = true;
            }

        } while(win == false);
        in.close();
    }
}
