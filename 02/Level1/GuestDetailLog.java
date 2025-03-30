import java.util.Scanner;
class GuestDetailLog{
	String guestName;
	String roomType;
	int nights;

	public GuestDetailLog(){
		this.guestName = "unknown";
		this.roomType = "Standard";
		this.nights = 1;
	}
	public GuestDetailLog(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	public GuestDetailLog(GuestDetailLog other){
		this.guestName = other.guestName;
		this.roomType = other.roomType;
		this.nights = other.nights;
	}
	public void display(){
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
		System.out.println("No. of Nights: " + nights);
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Guest Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Room Type: ");
		String room = sc.nextLine();
		System.out.print("Enter Number of Nights: ");
		int nights = sc.nextInt();
		
		GuestDetailLog booking1 =  new GuestDetailLog(name, room, nights);
		GuestDetailLog booking2 =  new GuestDetailLog(booking1);
		
		System.out.println("\nOriginal Booking:");
		booking1.display();
		System.out.println("\nCloned Booking:");
		booking2.display();
	}
}
		