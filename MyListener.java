package radio;
import java.awt.event.*;
public class MyListener implements ActionListener
{
   Display dp;
   MyListener(Display d)
   {
       this.dp = d;
   }
   public void actionPerformed(ActionEvent e)
   {
    if(e.getSource()==dp.btn_red)
    {
        dp.btn_red.setText("STOP");
    }
    if(e.getSource()==dp.btn_yellow)
    {
        dp.btn_yellow.setText("READY");
    }
    if(e.getSource()==dp.btn_green)
    {
        dp.btn_green.setText("GO");
    }
   }

}