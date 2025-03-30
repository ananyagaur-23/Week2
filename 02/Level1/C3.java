import java.util.Scanner;
class C3 {
    String name;
    int age;

    public C3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public C3(C3 other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        C3 person1 = new C3(name, age);
        C3 person2 = new C3(person1); 

        System.out.println("\nOriginal Person:");
        person1.display();
        
        System.out.println("\nCloned Person:");
        person2.display();
        
        sc.close();
    }
}
