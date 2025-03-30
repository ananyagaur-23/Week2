public class Main{
    public static void main(String[] args){
        Vehicle[] rides = {
                new Car("C001", "Amit", 15),
                new Bike("B001", "Ravi", 8),
                new Auto("A001", "Sunil", 10)
        };

        double distance = 12; // km

        for (Vehicle v : rides) {
            System.out.println(v.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance));
            System.out.println();
        }
    }
}
