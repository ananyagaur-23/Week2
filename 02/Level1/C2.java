public class C2{
    double radius;

    public C2() {
        this(1.0);
	}

    public C2(double radius) {
        this.radius = radius;
    }
    public void display() {
        System.out.println("Circle Radius: " + radius);
    }

    public static void main(String[] args) {
        C2 defaultCircle = new C2();
        System.out.println("Default Circle:");
        defaultCircle.display();

        System.out.println();

        C2 customCircle = new C2(5.5);
        System.out.println("Custom Circle:");
        customCircle.display();
    }
}
