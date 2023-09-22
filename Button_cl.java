import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*; 
public class Button_cl extends JFrame implements ActionListener
{
    private Button btn1, btn2, btn3, btn4, btn5, btn6;
      public void  Butoon_mt()
    {
        setLayout(new GridLayout(3, 2, 3, 3));
         // "super" Frame sets layout to 3x2 GridLayout, horizontal and vertical gaps of 3 pixels
 
      // The components are added from left-to-right, top-to-bottom
      btn1 = new Button("Button 1");
      add(btn1);
      btn2 = new Button("This is Button 2");
      add(btn2);
      btn3 = new Button("3");
      add(btn3);
      btn4 = new Button("Another Button 4");
      add(btn4);
      btn5 = new Button("Button 5");
      add(btn5);
      btn6 = new Button("One More Button 6");
      add(btn6);
      
       btn1.addActionListener(this);
       
      setTitle("GridLayout Demo"); // "super" Frame sets title
      setSize(280, 150);           // "super" Frame sets initial size
      setVisible(true);            // "super" Frame shows
    }
    public void actionPerformed(ActionEvent E)
    {
        if(E.getSource() == btn1)
        {
            System.out.println("Button1");
        }
    }
}