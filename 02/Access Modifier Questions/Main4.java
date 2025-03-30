public class Main4 {
    public static void main(String[] args) {
        Manager emp = new Manager(1001, "IT", 75000.00);
        emp.displayEmployeeDetails();

        emp.setSalary(80000.00);
        System.out.println("\nUpdated Employee Details:");
        emp.displayEmployeeDetails();
    }
}
