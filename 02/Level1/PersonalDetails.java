import java.util.Scanner;
class PersonalDetais {
    String name;
    int age;

    public PersonalDetais(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonalDetais(PersonalDetais other) {
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

        PersonalDetais person1 = new PersonalDetais(name, age);
        PersonalDetais person2 = new PersonalDetais(person1); 

        System.out.println("\nOriginal Person:");
        person1.display();
        
        System.out.println("\nCloned Person:");
        person2.display();
        
        sc.close();
    }
}
