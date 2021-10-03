/*It is a scan conversion line drawing algorithm. It is called Digital Differential Analyzer. */

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DDA_Line extends JPanel {
    @Override
    public void paint(Graphics g){
        double dx, dy, steps, x, y, k;
        double xc, yc;
        double x1=50, y1=300, x2=280, y2= 380;
        dx = x2-x1;
        dy = y2-y1;
        if(Math.abs(dx) > Math.abs(dy)){
            steps = Math.abs(dx);
        }
        else{
            steps = Math.abs(dy);
        }
        xc = (dx/steps);
        yc = (dy/steps);
        x = x1;
        y= y1;
        g.fillOval(200,500, 2,2);
        for(k = 1;k<=steps;k++){
            x = x+xc;
            y = y+yc;
            g.fillOval((int)x,(int)y,2,2);
        }
    }
    public static void main(String[] args){
        DDA_Line d1 = new DDA_Line();
        JFrame frame = new JFrame("Line");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(d1);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}