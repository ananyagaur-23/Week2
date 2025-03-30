class A4 {
    public int employeeID;
    protected String department;
    private double salary;

    A4(int employeeID, String department, double salary) {
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

class Manager extends A4 {
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + getSalary());
    }
}
