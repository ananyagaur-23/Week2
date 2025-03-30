interface GPS{
    public String getCurrentLocation();
    public void updateLocation(String location);
}
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    Vehicle(String vehicleId, String driverName, double ratePerKm){
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public String getVehicleDetails(){
        return ("Vehicle ID: "+vehicleId+"\nDriver's name: "+driverName+"\nRate per Km: "+ratePerKm);
    }
    public double getRatePerKm(){
        return ratePerKm;
    }
    public abstract double calculateFare(double distance);
}

class Car extends Vehicle implements GPS{
    private String location;

    Car(String id, String driver, double rate){
        super(id,driver,rate);
        this.location = "Unknown";
    }
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
    public String getCurrentLocation(){
        return location;
    }
    public void updateLocation(String location){
        this.location = location;
    }
}

class Bike extends Vehicle implements GPS{
    private String location;

    Bike(String id, String driver, double rate){
        super(id,driver,rate);
        this.location = "Unknown";
    }
    public double calculateFare(double distance){
        return  distance * getRatePerKm();
    }
    public String getCurrentLocation() {
        return location;
    }
    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

class Auto extends Vehicle implements GPS{
    private String location;

    Auto(String id, String driver, double rate){
        super(id, driver, rate);
        this.location = "Unknown";
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}