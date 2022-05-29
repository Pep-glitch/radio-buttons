package radio;
import javax.swing.*;

//import radio.MyListener;

import java.awt.Window.*;
import java.awt.AWTEvent.*;
import java.awt.event.WindowAdapter.*;
import java.awt.*;
import java.awt.event.*;
public class Display extends Frame
{
  MyListener ml = new MyListener(this);
  JButton btn_red, btn_yellow, btn_green;
  Display()
  {
      super();
      setLayout(null);
      setBounds(150,100,250,300);

      btn_red = new JButton();
      btn_yellow = new JButton();
      btn_green = new JButton();

      btn_red.setBounds(50,50,120,50);
      btn_yellow.setBounds(50,110,120,50);
      btn_green.setBounds(50,170,120,50);
        
      btn_red.setBackground(Color.RED);
      btn_yellow.setBackground(Color.YELLOW);
      btn_green.setBackground(Color.GREEN);
        
      add(btn_red);
      add(btn_yellow);
      add(btn_green);

      btn_red.addActionListener(ml);
      btn_yellow.addActionListener(ml);
      btn_green.addActionListener(ml);
      addWindowListener(new WindowAdapter()
        {
            //use closing method Not Closed
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
  }
  public static void main(String args[])
  {
      Display dp = new Display();
      dp.setVisible(true);
  }
}