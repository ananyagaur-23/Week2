class A1{
    public int rollNumber;
    protected String name;
    private double CGPA;

    A1(int rollNumber, String name, double CGPA) {
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

class Postgraduates extends A1 {
    Postgraduates(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}
