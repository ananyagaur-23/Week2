class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayDetail(){
        System.out.println("Name of Student: "+name+"\nAge: "+age);
    }
}

class Teacher extends Person{
    String subject;

    Teacher(String name,int age, String subject){
        super(name, age);
        this.subject = subject;
    }
    void displayRole(){
        System.out.println(name+" of age "+age+", is a Teacher, teaching "+subject);
    }
}

class Student extends Person{
    int grade;

    Student(String name, int age, int grade){
        super(name, age);
        this.grade = grade;
    }
    void displayRole(){
        System.out.println(name+" of age "+age+" is a student in grade "+grade);
    }
}

class Staff extends Person{
    String duty;

    Staff(String name, int age, String duty){
        super(name, age);
        this.duty = duty;
    }
    void displayRole(){
        System.out.println(name+" of age "+age+" is a staff in department of "+duty);
    }
}