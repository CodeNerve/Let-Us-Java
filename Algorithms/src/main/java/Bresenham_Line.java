/* It is another incremental scan conversion algorithm which only uses integer calculations.*/

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bresenham_Line extends JPanel{
    public void paint(Graphics g){
        int x, y, k;
        double dx, dy, p;
        int x1= 70, y1 = 120, x2 = 240, y2= 140;
        dx = Math.abs(x2-x1);
        dy = Math.abs(y2-y1);
        x= x1;
        y= y1;
        p = 2* dy - dx;
        g.fillOval(200,300,2,2);
        for(k=0;k<dx;k++){
            if(p<0){
                g.fillOval(x++,y,2,2);
                p = p + (2*dy);
            }
            else{
                g.fillOval(x++,y++,2,2);
                p = p+(2*(dy-dx));
            }
        }
    }

    public static void main(String[] args){
        Bresenham_Line bl = new Bresenham_Line();
        JFrame frame = new JFrame("Line");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(bl);
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
