public class RadiusCalculation{
    double radius;

    public RadiusCalculation() {
        this(1.0);
	}

    public RadiusCalculation(double radius) {
        this.radius = radius;
    }
    public void display() {
        System.out.println("Circle Radius: " + radius);
    }

    public static void main(String[] args) {
        RadiusCalculation defaultCircle = new RadiusCalculation();
        System.out.println("Default Circle:");
        defaultCircle.display();

        System.out.println();

        RadiusCalculation customCircle = new RadiusCalculation(5.5);
        System.out.println("Custom Circle:");
        customCircle.display();
    }
}
