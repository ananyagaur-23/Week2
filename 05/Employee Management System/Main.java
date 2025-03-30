public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 75000, 5);
        Developer developer = new Developer("Bob", 102, 60000, "Java");
        Intern intern = new Intern("Charlie", 103, 20000, 6);

        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}