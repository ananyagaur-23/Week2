import java.util.ArrayList;

class SchoolAssociationDemo {

    public static void main(String[] args) {
        School school = new School("Green Valley High");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");
        Course c3 = new Course("History");

        // Aggregation: School has Students
        school.addStudent(s1);
        school.addStudent(s2);

        // Association: Students enroll in Courses
        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);

        s2.enrollInCourse(c1);
        s2.enrollInCourse(c3);

        // View enrolled courses
        s1.viewCourses();
        s2.viewCourses();

        // View students in courses
        c1.viewEnrolledStudents();
        c2.viewEnrolledStudents();
        c3.viewEnrolledStudents();
    }
}

// Aggregation: School "has" Students
class School {
    private String name;
    private ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

// Association: Student ↔ Course (many-to-many)
class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this); // Bidirectional association
        }
    }

    public void viewCourses() {
        System.out.println("\nCourses enrolled by " + name + ":");
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void viewEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}
