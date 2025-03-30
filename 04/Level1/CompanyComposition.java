import java.util.ArrayList;

class CompanyComposition {
    public static void main(String[] args) {
        Company company = new Company("TechNova");

        company.addDepartment("Engineering");
        company.addDepartment("Marketing");

        company.addEmployeeToDepartment("Engineering", "Alice");
        company.addEmployeeToDepartment("Engineering", "Bob");
        company.addEmployeeToDepartment("Marketing", "Charlie");

        company.displayCompanyStructure();

        System.out.println("\nDeleting company...");
        company = null;
        System.gc();
        System.out.println("Company and all its departments and employees deleted.");
    }
}

class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addEmployeeToDepartment(String deptName, String employeeName) {
        for (Department dept : departments) {
            if (dept.getName().equalsIgnoreCase(deptName)) {
                dept.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department " + deptName + " not found!");
    }

    public void displayCompanyStructure() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }

    private class Department {
        private String name;
        private ArrayList<Employee> employees;

        public Department(String name) {
            this.name = name;
            employees = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addEmployee(String employeeName) {
            employees.add(new Employee(employeeName));
        }

        public void displayDepartment() {
            System.out.println("  Department: " + name);
            for (Employee emp : employees) {
                System.out.println("    Employee: " + emp.getName());
            }
        }

        private class Employee {
            private String name;

            public Employee(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }
    }
}
