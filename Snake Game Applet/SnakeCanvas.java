import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.*;

public class SnakeCanvas extends Canvas implements Runnable, KeyListener {
	private final int BOX_HEIGHT = 15;
    public final int BOX_WIDTH = 15;
    public final int GRID_HEIGHT = 25;
    public final int GRID_WIDTH = 25;

    private LinkedList<Point> snake;
    private Point fruit;
    private int direction = Direction.NO_DIRECTION;



    private Thread runThread;
   // private Graphics globalGraphics;
    private int score = 0;

    public void init()
    {

    }

    public void paint(Graphics g)
    {
    	
      this.setPreferredSize(new Dimension(640, 480));
      
      this.addKeyListener(this);
      
      if(snake== null)
      {
         snake = new LinkedList<Point>();
         GenerateDefaultSnake();
          PlaceFruit();
      }




      if(runThread == null)
      {
          runThread = new Thread((Runnable) this);
          runThread.start();
      }
        DrawSnake(g);
        DrawFruit(g);
        DrawGrid(g);
        DrawScore(g);
    }
    public void update(Graphics g)
    {
        //this is the default update method which will contain our double buffering
    	
        Graphics  offScreenGraphics; 
        BufferedImage offScreen = null;
        Dimension d = this.getSize();
        offScreen = new BufferedImage(d.width, d.height, BufferedImage.TYPE_INT_ARGB);
        offScreenGraphics = offScreen.getGraphics();
        offScreenGraphics.setColor(this.getBackground());
        offScreenGraphics.fillRect(0,0, d.width, d.height);
        offScreenGraphics.setColor(this.getForeground());
        paint(offScreenGraphics);

        //flip
        g.drawImage(offScreen, 0,0, this);
    }

    public void GenerateDefaultSnake()
    {
        score = 0;
        snake.clear();

        snake.add(new Point(0,2));
        snake.add(new Point(0,1));
        snake.add(new Point(0,0));
        direction = Direction.NO_DIRECTION;
    }


   public void Move()
   {
       Point head  = snake.peekFirst();
       Point newPoint = head;
       switch (direction){
       case Direction.NORTH :
           newPoint = new Point(head.x, head.y -1);
           break;

       case Direction.SOUTH :
               newPoint = new Point(head.x, head.y + 1);
               break;
       case Direction.WEST :
               newPoint = new Point(head.x - 1, head.y);
               break;
       case Direction.EAST :
               newPoint = new Point(head.x + 1, head.y);
               break;
       }

       snake.remove(snake.peekLast());

       if(newPoint.equals(fruit))
       {
           score+=10;
           Point addPoint = (Point) newPoint.clone();
           BufferedWriter writer = null;
           //the snake has hit fruit
           try {
   	    	writer = new BufferedWriter(new FileWriter("currentScore.txt",false));
   	    	writer.write(score);
           }
           catch(Exception e) {
   	    	System.out.println(e.toString());
   	       }
           
           switch (direction){
               case Direction.NORTH :
                   newPoint = new Point(head.x, head.y -1);
                   break;

               case Direction.SOUTH :
                   newPoint = new Point(head.x, head.y + 1);
                   break;
               case Direction.WEST :
                   newPoint = new Point(head.x - 1, head.y);
                   break;
               case Direction.EAST :
                   newPoint = new Point(head.x + 1, head.y);
                   break;
           }
           snake.push(addPoint );
           PlaceFruit();

       }
        else if(newPoint.x < 0 || newPoint.x > (GRID_WIDTH-1))
       {
           
           GenerateDefaultSnake();
           return;
       }
       else if(newPoint.y < 0 || newPoint.y > (GRID_HEIGHT-1))
       {
           
           GenerateDefaultSnake();
           return;
       }
       else if(snake.contains(newPoint))
       {
            

           GenerateDefaultSnake();
           return;

       }
       
       snake.push(newPoint);


   }

    public void DrawScore(Graphics g)
    {
        g.drawString("Score: " + score, 0, BOX_HEIGHT*GRID_HEIGHT + 10);
    }

    public void DrawGrid(Graphics g)
    {
       
       g.drawRect(0,0, GRID_WIDTH * BOX_WIDTH, GRID_HEIGHT * BOX_HEIGHT);
        
       for(int x = BOX_WIDTH; x < GRID_WIDTH*BOX_WIDTH; x += BOX_WIDTH)
       {
          g.drawLine(x, 0, x, BOX_HEIGHT*GRID_HEIGHT);
       }
       
       for(int y = BOX_HEIGHT; y < GRID_HEIGHT * BOX_HEIGHT; y += BOX_HEIGHT)
       {
         g.drawLine(0, y, GRID_WIDTH * BOX_WIDTH, y);
       }
    }
    public void DrawSnake(Graphics g)
    {
        g.setColor(Color.GREEN);
        for(Point p : snake)
        {
         g.fillRect(p.x * BOX_WIDTH, p.y * BOX_HEIGHT, BOX_WIDTH, BOX_HEIGHT);
        }
        g.setColor(Color.BLACK);
    }
    public void DrawFruit(Graphics g)
    {
      g.setColor(Color.RED);
      g.fillOval(fruit.x * BOX_WIDTH, fruit.y*BOX_HEIGHT, BOX_WIDTH, BOX_HEIGHT);
      g.setColor(Color.BLACK);
    }

    public void PlaceFruit()
    {
      Random rand = new Random();
      int randomX = rand.nextInt(GRID_WIDTH);
      int randomY = rand.nextInt(GRID_HEIGHT);
      Point randomPoint = new Point(randomX, randomY);
       while(snake.contains(randomPoint))
        {
            randomX = rand.nextInt(GRID_WIDTH);
            randomY = rand.nextInt(GRID_HEIGHT);
            randomPoint = new Point(randomX, randomY);
        }
       fruit = randomPoint;
    }
    @Override
    public void run()
    {
        while(true){
            // run indefinitely
            Move();
           
            repaint();
            
            try
            {
              Thread.currentThread();
              Thread.sleep(100);

            }  catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
      switch (e.getKeyCode())
      {
          case KeyEvent.VK_UP:

              if(direction != Direction.SOUTH)
                  direction = Direction.NORTH;
              break;
          case KeyEvent.VK_DOWN:
              if(direction != Direction.NORTH)
              direction = Direction.SOUTH;
              break;
          case KeyEvent.VK_RIGHT:
              if(direction != Direction.WEST)
              direction = Direction.EAST;
              break;
          case KeyEvent.VK_LEFT:
              if(direction != Direction.EAST)
              direction = Direction.WEST;
              break;
      }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {

    }

}
