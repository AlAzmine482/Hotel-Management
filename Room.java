
public class Room {
private boolean vacant = true;
private boolean occupied = false;


	public void Room()
	    {
		 int min = 1;
		 int max = 500;
		 int random = (int)Math.floor(Math.random()*(max - min)+ min);
		 //String RoomType;
		 String bed2 = "Double";
		 String bed1 = "Single"; 
		 String bed3 = "Triple";
		 String bed4 = "Quad"; 
		  // depending on which room chosen i give a set number depending on two values.
		 //Room Status
		 boolean status;		
		 //Room Type
		 // Room date
		 //Room availablity
	     System.out.println("Room number: " + random);
	      
	    }
}
