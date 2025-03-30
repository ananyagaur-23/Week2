import java.util.Scanner;

class EmployeeDetails {
    String name;
    int id;
    double salary;

    public EmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void Details() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class L1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        EmployeeDetails emp = new EmployeeDetails(name, id, salary);
        emp.Details();

        sc.close();
    }
}
