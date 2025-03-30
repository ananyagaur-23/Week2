class EmployeeDetails {
    public int employeeID;
    protected String department;
    private double salary;

    EmployeeDetails(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }
}

class Manager extends EmployeeDetails {
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + getSalary());
    }
}
public class Main {
    public static void main(String[] args) {
        Manager emp = new Manager(1001, "IT", 75000.00);
        emp.displayEmployeeDetails();

        emp.setSalary(80000.00);
        System.out.println("\nUpdated Employee Details:");
        emp.displayEmployeeDetails();
    }
}
