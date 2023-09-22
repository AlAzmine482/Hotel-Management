import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class User extends JFrame  implements ActionListener 
{//have user pull already made reservation
	//call user for whatever is being made/
	//retype name to pull up reservation.
	//confirmation number into incement
	
	 public static void User(Reservations reservation)
	    {
//		 setLayout(new FlowLayout());
//// create a user name,email, pass, dob
//		 btn1 = new JButton("Submit");
//		 btn1.setBounds(150, 1000, 100, 50);
//	      btn1.addActionListener(this);
	 // start at 0 and increment.     
//		 int min = 001;
//		 int max = 100;
//		 int random = (int)Math.floor(Math.random()*(max - min)+ min);
//	     System.out.println("Confirmation number: " + random);
		 
		 //create a pop up "Log In" 
	     String name = JOptionPane.showInputDialog("Name: ");
	     if(name.equals(reservation.getName())) {
	    	 JOptionPane.showMessageDialog(null, "Log In Successfully", name, JOptionPane.PLAIN_MESSAGE);
	     }
	     
	      
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
