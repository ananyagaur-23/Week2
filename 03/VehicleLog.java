class VehicleLog {
    private static double registrationFee = 5000;
    private final String registrationNumber;
    private String ownerName;
    private String VehicleLogType;

    public VehicleLog(String ownerName, String VehicleLogType, String registrationNumber) {
        this.ownerName = ownerName;
        this.VehicleLogType = VehicleLogType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (t
        his instanceof VehicleLog) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("VehicleLog Type: " + VehicleLogType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        VehicleLog car = new VehicleLog("Jake Cena", "Car", "ABC1234");
        car.displayDetails();

        updateRegistrationFee(6000);

        VehicleLog bike = new VehicleLog("John Doe", "Bike", "XYZ5678");
        bike.displayDetails();
    }
}
