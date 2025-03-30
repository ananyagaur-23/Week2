class RegistrationDetails{
	static int registrationFee = 0;
	String ownerName;
	String vehicleType;
	
	RegistrationDetails(String ownerName, String vehicleType){
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
		RegistrationDetails sale1 = new RegistrationDetails("John Cena","Ferari");
		sale1.displayDetails();
		
		RegistrationDetails.updateRegistrationFee(500);
		
		RegistrationDetails sale2 = new RegistrationDetails("James Bond","BMW");
		sale2.displayDetails();
	}
}