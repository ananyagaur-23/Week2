class StudentData{
    public int rollNumber;
    protected String name;
    private double CGPA;

    StudentData(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class Postgraduates extends StudentData {
    Postgraduates(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}
public class Main{
    public static void main(String[] args) {
        Postgraduates student = new Postgraduates(101, "Tweet", 9.2);
        student.display();
        student.setCGPA(9.5);
        System.out.println("Updated CGPA: " + student.getCGPA());
    }
}

