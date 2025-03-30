interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle{
    private String  vehicleNumber;
    private String type;
    private double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public String getType(){
        return type;
    }
    public double getRentalRate(){
        return rentalRate;
    }
    public void setRentalRate(double rentalRate){
        this.rentalRate = rentalRate;
    }
    public abstract double calculateRentalRate(int days);
}

class Car extends Vehicle implements Insurable{
    private String insurancePolicyNumber;
    Car(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber){
        super(vehicleNumber,type,rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    public double calculateRentalRate(int days){
        return getRentalRate() * days;
    }
    public double calculateInsurance(){
        return 1000;
    }
    public String getInsuranceDetails(){
        return "Car Insurance Applied";
    }
}

class Bike extends Vehicle{
    Bike(String vehicleNumber, double rentalRate){
        super(vehicleNumber,"Bike",rentalRate);
    }
    public double calculateRentalRate(int days){
        return getRentalRate() * days;
    }
}

class Truck extends Vehicle implements Insurable{
    public String insurancePolicyNumber;
    Truck(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber){
        super(vehicleNumber,type,rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    public double calculateRentalRate(int days){
        return getRentalRate() * days;
    }
    public double calculateInsurance() {
        return 2000;
    }
    public String getInsuranceDetails() {
        return "Truck Insurance Applied";
    }
}
