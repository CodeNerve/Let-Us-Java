import javax.swing.*;
import java.text.*;
import java.util.*;

public class DigitalClock implements Runnable {

    JFrame jf;
    Thread thr = null;
    int hours = 0;
    int minutes = 0;
    int seconds = 0;
    String timeString = "";

    JButton btn;

    public DigitalClock() {
        
        // Setting Frame for GUI
        
        jf = new JFrame();

        thr = new Thread(this);
        thr.start();

        btn = new JButton();
        btn.setBounds(100, 100, 100, 50);

        jf.add(btn);
        jf.setSize(300, 400);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public void run() {
        try {
            while (true) {
                Calendar cal = Calendar.getInstance();
                hours = cal.get(Calendar.HOUR_OF_DAY);
                if (hours > 12) {
                    hours -= 12;
                }
                minutes = cal.get(Calendar.MINUTE);
                seconds = cal.get(Calendar.SECOND);

                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
                Date date = cal.getTime();
                timeString = formatter.format(date);

                printTime();
                
                // 1 second sleep
                
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }

    public void printTime() {
        btn.setText(timeString);
    }

    public static void main(String[] args) {
        new DigitalClock();
    }
}
