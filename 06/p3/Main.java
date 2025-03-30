public class Main{
    public static void main(String[] args){
        Vehicle[] vehicles = {
                new Car("C909","Swift D'zire",2500,"INS50"),
                new Bike("B203",500),
                new Truck("T304","TATA Power",5000,"INS25")
        };
        for(Vehicle v : vehicles){
            System.out.println("Vehicle: "+v.getType());
            System.out.println("Number: "+v.getVehicleNumber());
            System.out.println("Rental(5 days): "+v.calculateRentalRate(5));

            if(v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.println("Insurance Cost: " + i.calculateInsurance());
                System.out.println(i.getInsuranceDetails());
            }
            else{
                System.out.println("No Insurance");
            }
            System.out.println();
        }
    }
}