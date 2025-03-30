class I3{
	static int registrationFee = 0;
	String ownerName;
	String vehicleType;
	
	I3(String ownerName, String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	void displayDetails(){
		System.out.println("\nName of Owner: "+ ownerName);
		System.out.println("Type of Vehicle: "+ vehicleType);
		System.out.println("Fee of Registration: "+ registrationFee);
	}
	static void updateRegistrationFee(int newFee){
		registrationFee = newFee;
	}
	public static void main(String[] args){
		I3 sale1 = new I3("John Cena","Ferari");
		sale1.displayDetails();
		
		I3.updateRegistrationFee(500);
		
		I3 sale2 = new I3("James Bond","BMW");
		sale2.displayDetails();
	}
}