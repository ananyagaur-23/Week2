class B5 {
    private static String universityName = "Global University";
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private double grade;

    B5(int rollNumber, String name, double grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof B5) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    void updateGrade(double newGrade) {
        if (this instanceof B5) {
            this.grade = newGrade;
            System.out.println("Updated Grade for " + name + ": " + grade);
        }
    }
}
