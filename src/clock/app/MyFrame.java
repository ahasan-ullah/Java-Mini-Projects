package clock.app;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {
    private Calendar calendar;
    private SimpleDateFormat timeFormat;
    private JLabel timeLabel;
    String time;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);

        timeFormat=new SimpleDateFormat("hh:mm:ss a");

        timeLabel=new JLabel();



        this.add(timeLabel);
        this.setVisible(true);

        setTime();
    }
    public void setTime(){
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
