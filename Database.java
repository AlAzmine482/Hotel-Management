import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Database extends JFrame implements ActionListener {
	public static void addToFile(Reservations reservation) {

		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter("Database.txt"));
			// writer.append
			// writer.write(reservation.getNameText());
			writer.append(String.valueOf(reservation.getconfirmationNumber() +", " ));
			writer.append(reservation.getName() + ", ");
			writer.append(reservation.getAge() + ", ");
			writer.append(reservation.getRoomType() + ", ");
			writer.append(String.valueOf(reservation.getOccupants()+ ", "));
			writer.append(reservation.getnumofStayin() + ", ");
			writer.append(reservation.getPaymentCardType() + ", ");
			writer.append(reservation.getCardType() + ", ");
			// writer.write("Name: "+ reservation.getName());
			// writer.write("\n Age: " + reservation.getAge());
			// writer.write("\n Room Type: "+ (String)reservation.getRoomType());
			// writer.write("\n Number of Occupants: " + reservation.getOccupants());
			// writer.write("\n Confirmation #: " + reservation.confirmation );
			// Database.change_re;

			// System.out.println(reservation.nameText.getText());
			// System.out.println(("\n Age: " + reservation.getAgeText().getText()));
//	    		 System.out.println((String)roomTypeComboBox.getSelectedItem());
//	    		 System.out.println("Content is in the file.");
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// void
//	public static void change_re(Reservations reservation) throws FileNotFoundException {
//		File file = new File("Database.txt");
//		Scanner scan = new Scanner(file);
////		System.out.println(scan.nextLine());
//		String e = scan.nextLine();
//		System.out.println(e);
//		// return scan.nextLine();
//
//	}
	public static void cancel_re(String confirmationNum){
        String textFileName = "Database.txt";
       // String splitter = ",";
        int pos = 0; //delete based on confirmation num which is at index 0

        String tmp = "Tmp.txt";
        File oldFile = new File("Database.txt");
        File newFile = new File(tmp);
        String currentLine;
        String[] lineElements;
 try{
            FileWriter fw = new FileWriter(tmp,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader(textFileName);
            BufferedReader br = new BufferedReader(fr);

            while((currentLine = br.readLine()) != null)
            {
                lineElements = currentLine.split(",");
                if (!(lineElements[pos].equalsIgnoreCase(confirmationNum)))
                {
                    pw.println(currentLine);
                }
            }
            pw.flush();
            pw.close();
            fr.close();
            br.close();
            fw.close();
            bw.close();


            oldFile.delete();
            File updatedFile = new File("Database.txt");
            newFile.renameTo(updatedFile);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }


	public static boolean isInFile(String confirmationNumber) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Database.txt"));
			String currentLine;
			String[] lineElements;
			int pos = 0;
			while ((currentLine = reader.readLine()) != null) {
				lineElements = currentLine.split(",");
				if (lineElements[pos].equalsIgnoreCase(confirmationNumber)) {
					return true;
				}
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static String pullFromFile(String confirmationNumber) {
        StringBuilder reservation = new StringBuilder();
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("Database.txt"));
            String currentLine;
            String[] lineElements;
            int pos = 0;
            while((currentLine = reader.readLine()) != null)
            {
                lineElements = currentLine.split(",");
                if (lineElements[pos].equalsIgnoreCase(confirmationNumber))
                {
                    for(String i:lineElements) {
                        reservation.append(i);
                    }
                    return reservation.toString();
                }
            }
            reader.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
       return null;
    }
	
	public static void increaseSingles(Reservations reservation)  {
		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter("Singles.txt"));
			
			writer.write(String.valueOf(reservation.getSingles() +", " ));

			// writer.write("Name: "+ reservation.getName());
			// writer.write("\n Age: " + reservation.getAge());
			// writer.write("\n Room Type: "+ (String)reservation.getRoomType());
			// writer.write("\n Number of Occupants: " + reservation.getOccupants());
			// writer.write("\n Confirmation #: " + reservation.confirmation );
			// Database.change_re;

			// System.out.println(reservation.nameText.getText());
			// System.out.println(("\n Age: " + reservation.getAgeText().getText()));
//	    		 System.out.println((String)roomTypeComboBox.getSelectedItem());
//	    		 System.out.println("Content is in the file.");
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public static void increaseDoubles(int x) throws FileNotFoundException {
		BufferedReader increaseDouble = new BufferedReader(new FileReader("Doubles.txt"));
	}
	public static void increaseTriple(int x) throws FileNotFoundException {
		BufferedReader increaseTriple = new BufferedReader(new FileReader("Triples.txt"));
	}
	public static void increaseQuad(int x) throws FileNotFoundException {
		BufferedReader increaseQuad = new BufferedReader(new FileReader("Quad.txt"));
	}
	public static void DecreaseSingles(int x) throws FileNotFoundException {
		BufferedReader DecreaseSingles = new BufferedReader(new FileReader("Singles.txt"));
	}
	public static void DecreaseDoubles(int x) throws FileNotFoundException {
		BufferedReader DecreaseDouble = new BufferedReader(new FileReader("Doubles.txt"));
	}
	public static void DecreaseTriple(int x) throws FileNotFoundException {
		BufferedReader DecreaseTriple = new BufferedReader(new FileReader("Triples.txt"));
	}
	public static void DecreaseQuad(int x) throws FileNotFoundException {
		BufferedReader DecreaseQuad = new BufferedReader(new FileReader("Quad.txt"));
	}
	public void actionPerformed(ActionEvent e) {

	}
}
