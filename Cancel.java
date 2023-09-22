import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;


public class Cancel {
		String confirmationNumToCancel;
       JOptionPane pane1, pane2;
       JPanel panel;
       JFrame fr;
       JTextField tf;
       JLabel lbl;
       JButton btn;
       
       public void cancel_re() {

           System.out.println(Database.pullFromFile("41"));


           lbl = new JLabel("Enter Confirmation Number:");
           //lbl.setVisible(true);
           lbl.setBounds(0,50,200,30);

           btn = new JButton("Submit");
           btn.setBounds(200, 199, 100,50);
           btn.addActionListener(new ActionListener() {
        	   
               @Override
               public void actionPerformed(ActionEvent e) {
                   confirmationNumToCancel = tf.getText();
                   if(Database.isInFile(confirmationNumToCancel)){
                       Database.cancel_re(confirmationNumToCancel);
                       pane2.showMessageDialog(null,"Cancellation Successful!", "Cancellation Status", JOptionPane.PLAIN_MESSAGE);
                       fr.dispose();
                   }
                   else
                   {
                       pane1 = new JOptionPane();
                       pane1.showMessageDialog(null,"Re-check confirmation number or call to speak with a front desk associate.", "Confirmation Number not found", JOptionPane.ERROR_MESSAGE);

                   }

               }
           } );
    }
}
