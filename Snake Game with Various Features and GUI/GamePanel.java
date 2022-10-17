import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    //SETS THE SCREEN WIDTH
    static final int SCREEN_WIDTH = 1000;

    //SETS THE SCREEN HEIGHT
    static final int SCREEN_HEIGHT = 750;

    //SETS SIZE OF EACH UNIT OF WINDOW
    static final int UNIT_SIZE = 30;

    //SETS THE UNIT FOR GAME TO PERFORM
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/(UNIT_SIZE);

    //SETS THE SPEED OF SNAKE
    int DELAY = 100;

    //X
    final int x[] = new int[GAME_UNITS];

    //Y
    final int y[] = new int[GAME_UNITS];

    //SETS THE NO. OF BODY PARTS THAT IS UNITS FOR SNAKES
    int bodyParts = 6;

    //FOR SCORE
    int fruitsEaten;

    //X DIM OF FRUIT
    int fruitX;

    //Y DIM OF FRUIT
    int fruitY;

    //FOR MOVEMENT OF SNAKE
    char direction = 'R';

    //USED FOR WORKING OF GAME
    boolean running = false;

    //TIMER VAR OF TIMER CLASS
    Timer timer;

    //RANDOM VAR FOR RANDOM CLASS
    Random random;

    //USED FOR PAUSE AND RESUME
    boolean GameOn;

    //CONSTRUCTOR
    GamePanel(){

            //CREATING INSTANCE
            random = new Random();

            //FOR SETUP
            this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT ));
            this.setBackground(new Color(50,190,255));
            this.setFocusable(true);
            this.addKeyListener(new MyKeyAdapter());

            //CALLING START GAME METHOD
            startGame();

    }

    //START GAME
    public void startGame(){

        //CALLING NEW FRUIT METHOD
        newFruit();

        //SETTING RUNNING VAR AS TRUE
        running = true ;

        //SETTING GAMEON VAR AS TRUE
        GameOn = true;

        //CREATING INSTANCE FOR TIMER CLASS
        timer = new Timer(DELAY,this);

        //CALLING METHOD START FROM TIMER CLASS
        timer.start();


    }

    //PAINT COMPONENT
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        //CALLING DRAW METHOD
        draw(g);

    }

    //DRAW METHOD
    public void draw(Graphics g){

        //IF GAME IS RUNNING
        if(running) {

            //THIS PART OF CODE IS FOR GRID LINE
//            for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
//                g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
//                g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
//            }

            //SETTING COLOR OF FRUIT
            g.setColor(Color.red);

            //SETTING POSITION OF FRUIT
            g.fillOval(fruitX, fruitY, UNIT_SIZE, UNIT_SIZE);

            //SETUP FOR SNAKE
            for (int i = 0; i < bodyParts; i++) {

                //SETTING HEAD OF SNAKE
                if(i == 0) {

                    //SETTING HEAD OF SNAKE AS BLACK
                    g.setColor(Color.black);

                    //SETTING POSITION OF HEAD
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);

                }
                else {

                    //SETTING SNAKE BODY PART COLORS
                    g.setColor(new Color(random.nextInt(255) , 10, 0));

                    //SETTING SNAKE BODY PART POSITION
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);

                }
            }

            //SETUP FOR SCORE TEXT

            //SETTING THE COLOR AS BLACK
            g.setColor(Color.black);

            //SETTING FONT AND SIZE
            g.setFont(new Font("TimesRoman" , Font.BOLD,60));

            //CREATING INSTANCE
            FontMetrics metrics = getFontMetrics(g.getFont());

            //SETTING THE POSITION
            g.drawString("Score: "+fruitsEaten,(SCREEN_WIDTH - metrics.stringWidth("Score: "+fruitsEaten))/2,g.getFont().getSize());

        }
        else{

            //CALLING GAMEOVER METHOD
            gameOver(g);

        }
    }

    //NEW FRUIT METHOD
    public void newFruit() {

            //SETTING THE POSITION OF APPLE RANDOMLY
            fruitX = random.nextInt((int) (SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
            fruitY = random.nextInt((int) (SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;

    }

    //MOVE METHOD
    public void move(){

        //FOR MOVEMENT OF SNAKE
        for(int i=bodyParts;i>0;i--){
            x[i] = x[i-1] ;
            y[i] = y[i-1];
        }

        //FOR SETTING THE DIRECTION OF MOVEMENT
        switch(direction){

            //UP
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;

            //DOWN
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;

            //LEFT
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;

            //RIGHT
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;

        }
    }

    //CHECK FRUIT METHOD
    public void checkFruit(){

        //FOR EATING UP OF FRUIT
        if((x[0] == fruitX)&&(y[0] == fruitY)){

            //INCREASING BODY PARTS AFTER EATING FRUIT
            bodyParts++;

            //INCREASING THE SCORES
            fruitsEaten++;

            //INCREASING THE SPEED OF SNAKE
            DELAY += 20;

            //CALLING THE NEW FRUIT METHOD - CREATING NEW FRUIT RANDOMLY
            newFruit();

        }
    }

    //CHECK COLLISION METHOD
    public void checkCollisions(){

        //CHECKS IF HEAD COLLIDES WITH BODY PARTS
        for(int i = bodyParts;i>0;i--){

            if((x[0] == x[i])&&(y[0] == y[i])){

                //STOPPING THE GAME AFTER COLLISION
                running = false;

            }
        }

        //IF HEAD COLLIDES WITH LEFT BORDER
        if(x[0] < 0){

            running = false;

        }

        //IF HEAD COLLIDES WITH RIGHT BORDER
        if(x[0] > SCREEN_WIDTH){

            running = false;

        }

        //IF HEAD COLLIDES WITH TOP BORDER
        if (y[0] < 0){

            running = false;

        }

        //IF HEAD COLLIDES WITH BOTTOM BORDER
        if(y[0] > SCREEN_HEIGHT){

            running = false;

        }

        //IF RUNNING VAR IS FALSE STOP GAME
        if(!running){

            timer.stop();

        }
    }

    //GAME OVER METHOD
    public void gameOver(Graphics g) {

        //SETUP FOR GAME OVER TEXT

        //SETTING COLOR TO RED
        g.setColor(Color.red);

        //SETTING FONT AND SIZE
        g.setFont(new Font("DialogInput" , Font.BOLD,175));

        //CREATING INSTANCE
        FontMetrics metrics1 = getFontMetrics(g.getFont());

        //SETTING ITS POSITION
        g.drawString("Game Over",(SCREEN_WIDTH - metrics1.stringWidth("Game Over"))/2,SCREEN_HEIGHT/2);

        //SETUP FOR SCORE TEXT

        //SETTING COLOR AS RED
        g.setColor(Color.red);

        //SETTING FONT AND SIZE
        g.setFont(new Font("Palatino" , Font.BOLD,80));

        //CREATING INSTANCE
        FontMetrics metrics2 = getFontMetrics(g.getFont());

        //SETTING POSITION
        g.drawString("Score: "+fruitsEaten,(SCREEN_WIDTH - metrics2.stringWidth("Score: "+fruitsEaten))/2,g.getFont().getSize());

    }


    //OVERRIDING THE METHOD
    @Override
    public void actionPerformed(ActionEvent e){

        //IF GAME IS RUNNING
        if(running){

            //CALLING  METHODS MOVE , CHECK FRUIT , CHECK COLLISIONS
            move();
            checkFruit();
            checkCollisions();

        }

        //CALLING REPAINT METHOD
            repaint();

    }

    //CLASS MYKEYADAPTER EXTENDING KEYADAPTER
    public class MyKeyAdapter extends KeyAdapter{

        //OVERRIDING METHOD
        @Override
        public void keyPressed(KeyEvent e){

            //FOR KEYBOARD INPUT
            switch(e.getKeyCode()){

                //IF LEFT KEY IS USED
                case KeyEvent.VK_LEFT:

                    //CHANGING THE DIRECTION TO LEFT
                    if(direction != 'R'){

                        direction = 'L';

                    }

                    break;

                //IF RIGHT KEY IS USED
                case KeyEvent.VK_RIGHT:

                    //CHANGING THE DIRECTION TO RIGHT
                    if(direction != 'L'){

                        direction = 'R';

                    }

                    break;

                //IF UP KEY IS USED
                case KeyEvent.VK_UP:

                    //CHANGING THE DIRECTION TO UP
                    if(direction != 'D'){

                        direction = 'U';

                    }

                    break;

                    //IF DOWN KEY IS USED
                case KeyEvent.VK_DOWN:

                    //CHANGING THE DIRECTION TO DOWN
                    if(direction != 'U'){

                        direction = 'D';

                    }

                    break;

                //IF ENTER KEY IS USED
                case KeyEvent.VK_ENTER:

                    //PAUSING THE GAME
                    if(GameOn){

                        GameOn = false;
                        timer.stop();

                    }

                    //RESUMING THE GAME
                    else{

                        GameOn = true ;
                        timer.start();

                    }

                    break;
            }
        }
    }
}
