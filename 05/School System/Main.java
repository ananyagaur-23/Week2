class Main {
    public static void main(String[] args){
        Teacher teacher = new Teacher("Brandon",23, "Mathematics");
        Student student = new Student("Manny",12,6);
        Staff staff = new Staff("Zayn",35,"Administration");

        teacher.displayDetail();
        teacher.displayRole();

        student.displayDetail();
        student.displayRole();

        staff.displayDetail();
        staff.displayRole();
    }
}