import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

//import javax.swing.JTable;
import java.io.*;

//Jtable maybe
// hotel availbility run through linked list

//?*/**/
public class Reservations extends JFrame implements ActionListener {

	// File file = new File("someFile. txt");
	int min = 01;
	int max = 40;
	int confirmation = (int) Math.floor(Math.random() * (max - min) + min);
	private int userID;
	private String roomType;
	private String age;
	private String occupant;
	public String numofStayin;
	public String payment;
	public static String name;
	public String card;

	public JComboBox roomTypeComboBox;
	public JComboBox numOccupuntComboBox;
	private JComboBox DayCombobox;
	private JComboBox PaymentCombobox;
	public JComboBox CardTypeCombobox;

	public JTextField nameText, ageText, occupantText, roomTypeText, userIDText;

	private String fullname;
	private JPanel fullnamepanel, roomTypePanel, agePanel, occupantPanel, userIDPanel, paymentPanel;
	private JButton btn1, btn2, btn3, btn4, btn5;
	private JLabel fullnameLabel, ageLabel, roomTypeLabel, occupantsLabel, randomLabel, dayLabel, CardTypeLabel,
			NoRoomLabel, paymentLabel, unpaidLabel, successLabel;
	String[] roomtype = { "Single", "Double", "Triple", "Quad" };
	private int singles = 10;
	private int doubles = 10;
	private int quads = 10;
	private int triple = 10;
	
	/**
	 * 
	 */
	
//	public int testAvailablity(int singles) {
//		if(singles > 10)
//			System.out.println("Rooms available");
//		return  singles;
//		
//	}

	public void Booking() {
		// --Original layout---
		// setLayout(new FlowLayout());
		// nameText = new JTextField();
		// ----------------buttons-------------------------------------------
		btn1 = new JButton("Pay Now"); // btn1 creation
		// 200, 300, 100, 50
		btn1.setBounds(50, 650, 100, 30);
		btn1.addActionListener(this);
		// JOptionPane.("Submitted");

		btn2 = new JButton("Pay Later");
		btn2.setBounds(350, 650, 100, 30);
		btn2.addActionListener(this);
		// jframe.add
		// fullnamepanel.add(btn2);
		btn3 = new JButton("Submit");
		//btn3.setBounds(200, 700, 100, 30);
		//btn3.addActionListener(this);
		
		btn4 = new JButton();

		// ---label----
		fullnameLabel = new JLabel();
		fullnameLabel.setText("Full Name: ");
		fullnameLabel.setHorizontalAlignment(JLabel.LEFT);
		fullnameLabel.setBounds(50, 10, 100, 100);

		ageLabel = new JLabel();
		ageLabel.setText("Age: ");
		ageLabel.setHorizontalAlignment(JLabel.LEFT);
		ageLabel.setBounds(50, 50, 100, 100);

		roomTypeLabel = new JLabel();
		roomTypeLabel.setText("Room Type: ");
		roomTypeLabel.setHorizontalAlignment(JLabel.LEFT);
		roomTypeLabel.setBounds(50, 90, 100, 100);

		occupantsLabel = new JLabel();
		occupantsLabel.setText("Number of Occupants: ");
		occupantsLabel.setHorizontalAlignment(JLabel.LEFT);
		occupantsLabel.setBounds(50, 130, 150, 100);

		dayLabel = new JLabel();
		dayLabel.setText("How many Days will you stay in:");
		dayLabel.setHorizontalAlignment(JLabel.LEFT);
		// original: 50, 100, 300, 300
		dayLabel.setBounds(50, 170, 230, 100);

		CardTypeLabel = new JLabel();
		CardTypeLabel.setText("Card Type");
		CardTypeLabel.setHorizontalAlignment(JLabel.LEFT);
		// Original bounds: 50, 100, 300, 300
		CardTypeLabel.setBounds(50, 200, 300, 200);

		// ---------------panels----------------------------------------------
		fullnamepanel = new JPanel(null);// Panel creation
		fullnamepanel.setPreferredSize(new Dimension(500, 750));
		fullnamepanel.setBackground(Color.GRAY);

		fullnamepanel.add(btn1);
		fullnamepanel.add(fullnameLabel);
		fullnamepanel.add(ageLabel);
		fullnamepanel.add(roomTypeLabel);
		fullnamepanel.add(occupantsLabel);
		fullnamepanel.add(dayLabel);
		fullnamepanel.add(CardTypeLabel);
		fullnamepanel.add(btn2);

		nameText = new JTextField();
		nameText.setPreferredSize(new Dimension(500, 40));
		nameText.setBounds(225, 50, 200, 30);
		fullnamepanel.add(nameText);

		ageText = new JTextField();
		ageText.setPreferredSize(new Dimension(500, 40));
		ageText.setBounds(225, 90, 200, 30);
		fullnamepanel.add(ageText);

		String[] roomtype = { "Single", "Double", "Triple", "Quad" };
		roomTypeComboBox = new JComboBox(roomtype);
		roomTypeComboBox.setBounds(235, 130, 175, 30);
		fullnamepanel.add(roomTypeComboBox);

		String[] numOccupunt = { "one", "Two", "Three" };
		// numOccupunt = new JComboBox(numOccupunt);
		numOccupuntComboBox = new JComboBox(numOccupunt);
		numOccupuntComboBox.setBounds(240, 170, 175, 30);
		fullnamepanel.add(numOccupuntComboBox);

		randomLabel = new JLabel();
		randomLabel.setText("Confirmation Number:" + confirmation);
		randomLabel.setHorizontalAlignment(JLabel.LEFT);
		// 50, 170, 200, 100
		randomLabel.setBounds(50, 100, 300, 300);
		fullnamepanel.add(randomLabel);

		String[] day = { "1", "2", "3", "4", "5", "6", "indefintenly" };
		DayCombobox = new JComboBox(day);
		// 300, 245, 175, 30
		DayCombobox.setBounds(270, 205, 155, 30);
		fullnamepanel.add(DayCombobox);

		NoRoomLabel = new JLabel();
		NoRoomLabel.setText("No rooms available");
		NoRoomLabel.setBounds(200, 400, 200, 200);
		NoRoomLabel.setVisible(false);
		fullnamepanel.add(NoRoomLabel);

		String[] Payment = { "Mastercard", "Visa" };
		PaymentCombobox = new JComboBox(Payment);
		PaymentCombobox.setBounds(200, 300, 175, 30);
		fullnamepanel.add(PaymentCombobox);

		String[] CardType = { "Debit ", "Credit" };
		CardTypeCombobox = new JComboBox(CardType);
		CardTypeCombobox.setBounds(200, 350, 175, 30);
		fullnamepanel.add(CardTypeCombobox);

		ArrayList<Integer> ConfirmationList = new ArrayList();
		ArrayList<Integer> reservationdays = new ArrayList();
		while (ConfirmationList.contains(confirmation)) {
			confirmation = (int) Math.floor(Math.random() * 40);
			System.out.println("this confirmation is already in the list: " + confirmation);
		}
		ConfirmationList.add(confirmation);
		// reservationdays.add(DayCombobox);

		System.out.println("ReservationList: " + ConfirmationList);

		paymentPanel = new JPanel(null);// Panel creation
		paymentPanel.setPreferredSize(new Dimension(200, 300));
		paymentPanel.setBackground(Color.WHITE);

		paymentLabel = new JLabel();
		paymentLabel.setText("Paid & Saved Successfully");
		paymentLabel.setBounds(50,50,100,30);
		paymentLabel.setVisible(false);
		// paymentPanel.setVisible(false);
		// paymentPanel.add(paymentLabel);

		unpaidLabel = new JLabel();
		unpaidLabel.setText("Unpaid");
		unpaidLabel.setVisible(false);
		
		
//		successLabel = new JLabel();
//		successLabel.setText("\n Saved Successfully!!");
//		successLabel.setBounds(50, 200, 50, 30);
//		successLabel.setVisible(false);
		
		

		if (getSingles() == 0 && doubles == 0 && quads == 0 && triple == 0) {
			btn1.setVisible(false);
			NoRoomLabel.setVisible(true);
		}

		if (roomTypeComboBox.getSelectedItem() == "Single" && getSingles() > 0) {
			setSingles(getSingles() - 1);
			System.out.println("Single rooms left: " + getSingles());
		} else {
			NoRoomLabel.setVisible(true);
		}
		if (roomTypeComboBox.getSelectedItem() == "Double" && doubles > 0) {
			--doubles;
			System.out.println("Single rooms left: " + doubles);
		} else if (roomTypeComboBox.getSelectedItem() == "Triple" && triple > 0) {
			--triple;
			System.out.println("Single rooms left: " + triple);
		}
		if (roomTypeComboBox.getSelectedItem() == "Quad" && quads > 0) {
			--quads;
			System.out.println("Single rooms left: " + quads);
		} else if (roomTypeComboBox.getSelectedItem() == "Single" && getSingles() == 0) {
			
			NoRoomLabel.setVisible(true);

			// fullnamepanel.add(NoRoomLabel);
		} else if (roomTypeComboBox.getSelectedItem() == "Double" && doubles == 0) {
			// will just show a label saying no rooms available
			NoRoomLabel.setVisible(true);
		} else if (roomTypeComboBox.getSelectedItem() == "Triple" && triple == 0) {
			// will just show a label saying no rooms available
			NoRoomLabel.setVisible(true);
		} else if (roomTypeComboBox.getSelectedItem() == "Quad" && quads == 0) {
			// JOptionPane.showInputDialog("No rooms available");
			NoRoomLabel.setVisible(true);
		}
		// checking info
		System.out.println("This reservation has: " + DayCombobox.getSelectedItem() + " day ");

		// ---------------super frame-----------------------------------------
		add(fullnamepanel);
		setTitle("Reservations");
		setLayout(new FlowLayout());
		setSize(500,750);
		//1000,1000
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		//fullnamepanel.add(btn3);

		// Super frame and JFrame are the same thing just did this because of bugs

		// JFrame jframe = new JFrame();
		// jframe.setTitle("Reservations");
		// jframe.setSize(1500, 1000);
		// jframe.setVisible(true);
		// jframe.setLayout(new FlowLayout());
		// jframe.add(fullnamepanel);
		// jframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE)
		// jframe.add(btn1);
		
		// for loop to check room type and the amount of days with the same room number
		// for availablity

		System.out.println("ReservationsTap");
		System.out.println("Confirmation number: " + confirmation);
		// System.out.println(nameText.getText());

		// String name = getNameText().getText();
	
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent E) {
		// TODO Auto-generated method stub
		
		// create a pop up for payment.
		JFrame jframe2 = new JFrame();
		jframe2.setTitle("Reservations");
		jframe2.setSize(300, 300);
		jframe2.setVisible(false);
		jframe2.setLayout(new FlowLayout());
		jframe2.add(paymentLabel);
		jframe2.add(unpaidLabel);
	//	jframe2.add(successLabel);
		//jframe2.add(btn3);
		jframe2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		

		if (E.getSource() == btn1) {
			
			paymentLabel.setVisible(true);
			unpaidLabel.setVisible(false);
			jframe2.setVisible(true);
			System.out.println(paymentLabel.getText());
		
			//successLabel.setVisible(true);

			Reservations reservation = new Reservations();
			reservation.confirmation = (int) (Math.random() * 101);
			ArrayList<Integer> ConfirmationList = new ArrayList<>();

			while (ConfirmationList.contains(confirmation)) {
				confirmation = (int) Math.floor(Math.random() * 40);
				System.out.println("this confirmation is already in the list: " + confirmation);
			}
			ConfirmationList.add(confirmation);
			reservation.name = nameText.getText();
			reservation.age = ageText.getText();
			reservation.roomType = (String) roomTypeComboBox.getSelectedItem();
			reservation.numofStayin = (String) DayCombobox.getSelectedItem();
			reservation.occupant =  (String) numOccupuntComboBox.getSelectedItem();
			reservation.payment = (String) PaymentCombobox.getSelectedItem();
			reservation.card = (String) CardTypeCombobox.getSelectedItem(); 
			reservation.singles = (int) singles;
			reservation.doubles = (int) doubles;
			//User.User(reservation);
			// * do card type *
				String fullname = reservation.name;
				System.out.println(reservation.getSingles());
			// Writing into database
			Database.addToFile(reservation);
			Database.increaseSingles(reservation);
			//JOptionPane.showMessageDialog(reservation, reservation.name);
			JOptionPane.showMessageDialog(reservation,"Name: " + reservation.name + "\n Age: " + reservation.age + "\n RoomType: " + reservation.roomType + "\n Numbers of Day Staying in: " + reservation.numofStayin + "\n Occupants:" + reservation.occupant + "\n Confirmation Number: " + reservation.confirmation ,"Reciept" , JOptionPane.PLAIN_MESSAGE);
		//	try {
		//		Database.change_re(reservation);
		//	} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
		//		e.printStackTrace();
		//	}
			File file = new File("Database.txt");
			Scanner scan = null;
			try {
				scan = new Scanner(file);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
//			System.out.println(scan.nextLine());
			String e = scan.nextLine();
			System.out.println(e);
			jframe2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
			//JOptionPane.showMessageDialog("Reciept", JOptionPane.PLAIN_MESSAGE);
			//Receipt (read file method)
			//method in database iterates throughtout file pass a confirmation number and searches for it
			
			
            //jframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			
			
		} else if (E.getSource() == btn2) {
			
			jframe2.setVisible(true);
			paymentLabel.setVisible(false);
			unpaidLabel.setVisible(true);
			jframe2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			
			System.out.println("unpaid");
		}
		
		
	
		
		}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
		// age = getNameText();
	}

	public String getRoomType() {
		return roomType;
	}

	public String getOccupants() {
		return occupant;
	}

	public int getconfirmationNumber() {
		return confirmation;
	}

	public String getnumofStayin() {
		return numofStayin;
	}

	public void setnumofStayin(String newNumofStayin) {
		this.numofStayin = newNumofStayin;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void setAge(String newAge) {
		this.age = newAge;
	}

	public void setRoomType(String newRoomType) {
		this.roomType = newRoomType;
	}

	public void setOccupants(String newOccupants) {
		this.occupant = newOccupants;
	}

	public void setPaymentCard(String newPaymentCard) {
		this.payment = newPaymentCard;
	}
	
	public String getPaymentCardType() {
		// TODO Auto-generated method stub
		return payment;
	}

	public void setCardType(String newCardType) {
		this.card = newCardType;
	}
	
	public String getCardType() {
		// TODO Auto-generated method stub
		return card;
	}

	public int getSingles() {
		return singles;
	}

	public void setSingles(int singles) {
		this.singles = singles;
	}
	


	

}
