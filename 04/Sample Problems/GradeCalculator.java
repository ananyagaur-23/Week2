import java.util.List;
import java.util.ArrayList;

class Subject {
    private String name;
    private int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }
}

class GradeCalculator {

    public String calculateGrade(Student student) {
        int totalMarks = 0;
        int numSubjects = student.getSubjects().size();

        for (Subject subject : student.getSubjects()) {
            totalMarks += subject.getMarks();
        }

        double average = (double) totalMarks / numSubjects;
        return determineGrade(average);
    }

    private String determineGrade(double average) {
        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
