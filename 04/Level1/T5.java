import java.util.*;

class Courses {
    String courseName;
    Professor professor;
    List<Students> students = new ArrayList<>();

    public Courses(String courseName) {
        this.courseName = courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Students student) {
        students.add(student);
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Enrolled Students: ");
        for (Students s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

class Professor {
    String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Courses course) {
        course.assignProfessor(this);
    }
}

class Students {
    String name;
    List<Courses> enrolledCourses = new ArrayList<>();

    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Courses course) {
        enrolledCourses.add(course);
        course.enrollStudent(this);
    }

    public void displayEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (Courses c : enrolledCourses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor p1 = new Professor("Dr. Smith");
        Professor p2 = new Professor("Dr. Johnson");

        Courses c1 = new Courses("Mathematics");
        Courses c2 = new Courses("Physics");

        Students s1 = new Students("Alice");
        Students s2 = new Students("Bob");

        c1.assignProfessor(p1);
        c2.assignProfessor(p2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);

        System.out.println("\nCourse Details:");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();

        System.out.println("Student Enrollments:");
        s1.displayEnrolledCourses();
        s2.displayEnrolledCourses();
    }
}
