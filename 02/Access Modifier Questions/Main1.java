public class Main1{
    public static void main(String[] args) {
        Postgraduates student = new Postgraduates(101, "Tweet", 9.2);
        student.display();
        student.setCGPA(9.5);
        System.out.println("Updated CGPA: " + student.getCGPA());
    }
}
