import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;

class RectangleComponent extends JComponent{
    private static final int RECTANGLE_WIDTH = 30;
    private static final int RECTANGLE_HEIGHT = 30;
    private int xLeft1, yTop1;
    private int xLeft2, yTop2;
    public RectangleComponent(){
        xLeft1 =0;
        yTop1=0;
        xLeft2=330;
        yTop2=330;
    }

    public void paintComponent(Graphics g){
        g.fillRect(xLeft1, yTop1, RECTANGLE_WIDTH, RECTANGLE_HEIGHT);
        g.fillRect(xLeft2, yTop2, RECTANGLE_WIDTH, RECTANGLE_HEIGHT);

    }

    public void moveRectangleBy(int dx, int dy){
        xLeft1 = xLeft1 + dx;
        yTop1 = yTop1 + dy;
        xLeft2 = xLeft2 - dx;
        yTop2 = yTop2 - dy;

        repaint();
    }
}

class RectangleFrame extends JFrame {
    private static final int FRAME_WIDTH = 380;
    private static final int FRAME_HEIGHT = 400;

    private RectangleComponent scene;
    public RectangleFrame(){
        scene = new RectangleComponent();
        add(scene);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        ActionListener listener = new TimerListener();
        final int DELAY = 100;
        Timer t = new Timer(DELAY,listener);
        t.start();
    }

    class TimerListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            scene.moveRectangleBy(1,1);
        }
    }

}





public class MovingTwoRectangle {
    public static void main(String[] args) {
        JFrame frame = new RectangleFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
