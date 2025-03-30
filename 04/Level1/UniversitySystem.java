import java.util.*;

class Faculty {
    String name;
    public Faculty(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class Department {
    String name;
    List<Faculty> facultyList = new ArrayList<>();
    public Department(String name) {
        this.name = name;
    }
    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }
    public String getName() {
        return name;
    }
    public List<Faculty> getFacultyList() {
        return facultyList;
    }
}

class University {
    String name;
    List<Department> departments = new ArrayList<>();
    public University(String name) {
        this.name = name;
    }
    public void addDepartment(Department department) {
        departments.add(department);
    }
    public void displayStructure() {
        System.out.println("University: " + name);
        for (Department d : departments) {
            System.out.println("  Department: " + d.getName());
            for (Faculty f : d.getFacultyList()) {
                System.out.println("    Faculty: " + f.getName());
            }
        }
    }
}

class UniversitySystem {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Alice");
        Faculty f2 = new Faculty("Dr. Bob");
        Faculty f3 = new Faculty("Dr. Charlie");

        Department cs = new Department("Computer Science");
        cs.addFaculty(f1);
        cs.addFaculty(f2);

        Department math = new Department("Mathematics");
        math.addFaculty(f3);

        University uni = new University("Global Tech University");
        uni.addDepartment(cs);
        uni.addDepartment(math);

        uni.displayStructure();

        System.out.println("Faculty existing outside university:");
        Faculty f4 = new Faculty("Dr. Diana");
        System.out.println("  Faculty: " + f4.getName());
    }
}
