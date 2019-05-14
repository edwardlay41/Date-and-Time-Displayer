import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Now
{
  private class ShowDate implements ActionListener
  {
    public void actionPerformed(ActionEvent arg0)
    {
      dateField.setText(currentTime.toString());     
    }
    
  }
  
  private final static int DISPLAY_WIDTH = 17;
  private JFrame frame;
  private JTextField dateField;
  private Date currentTime;
  private JButton now;
  
  
  
  public Now() 
  {
    ShowDate date = new ShowDate();
    frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    currentTime = new Date();
    Container contentpane = frame.getContentPane();
    contentpane.setLayout(new FlowLayout());
    now = new JButton("Now");
    now.addActionListener(date);
    dateField = new JTextField(DISPLAY_WIDTH);
    dateField.setEditable(false);
    
    contentpane.add(now);
    contentpane.add(dateField);
    
  }
  
  
  public static void main(String args[]) 
  {
    new Now().display();
  }
  private void display()
  {
    frame.pack();
    frame.setVisible(true); 
  }

}
