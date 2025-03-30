public class Main{
    public static void main(String[] args){
        ElectricalVehicle ev = new ElectricalVehicle(250, "Tesla A5", 500);
        PetrolVehicle pv = new PetrolVehicle(300, "Ferari Black", 800);

        ev.displayDetail();
        ev.charge();

        pv.displayDetail();
        pv.refuel();
    }
}