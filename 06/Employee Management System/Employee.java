import java.util.ArrayList;
import java.util.List;

interface Department{
    void assignDepartment(String department);
    String getDepartmentDetail();
}

abstract class Employee {
    private String employeeID;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(String employeeID, String name, double baseSalary){
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getEmployeeID(){
        return employeeID;
    }
    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }

    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }

    abstract  double calculateSalary();

    void displayDetail(){
        System.out.println("ID: "+employeeID+"\nName: "+name+"\nSalary: "+calculateSalary()+"\nDepartment: "+department);
    }
}

class FullTimeEmployee extends Employee{
    private double bonus;

    FullTimeEmployee(String employeeID, String name, double baseSalary, double bonus){
        super(employeeID, name, baseSalary);
        this.bonus = bonus;
    }

    double calculateSalary(){
        return getBaseSalary()+ bonus;
    }
    public void assignDepartment(String department){
        setDepartment(department);
    }
    public String getDepartmentDetail(){
        return ("Full-Time Employee in "+getDepartment()+" department.");
    }
}

class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    PartTimeEmployee(String employeeID, String name, double baseSalary, int hoursWorked, double hourlyRate){
        super(employeeID, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    double calculateSalary(){
        return getBaseSalary() + (hoursWorked*hourlyRate);
    }
    public void assignDepartment(String department){
        setDepartment((department));
    }
    public String getDepartmentDetails(){
        return ("Part-time employee in "+getDepartment()+" department.");
    }
}
