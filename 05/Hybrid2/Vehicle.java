interface Refuelable{
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    void displayDetail(){
        System.out.println("The max speed is "+maxSpeed+", and the model is "+model);    }
}

class ElectricalVehicle extends Vehicle{
    int battery;

    ElectricalVehicle(int maxSpeed, String model, int battery){
        super(maxSpeed, model);
        this.battery = battery;
    }
    void charge(){
        System.out.println(model+" is charging with a battery capacity of "+battery);
    }
}

class PetrolVehicle extends Vehicle{
    int fuel;

    PetrolVehicle(int maxSpeed, String model, int fuel){
        super(maxSpeed, model);
        this.fuel = fuel;
    }
    public void refuel(){
        System.out.println(model+" is refueling with a tank capacity of "+fuel);
    }
}
