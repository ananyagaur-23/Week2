import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter type of Animal: ");
        String type = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Animal animal;
        switch (type.toLowerCase()){
            case "dog":
                animal = new Dog(name, age);
                break;
            case "cat":
                animal = new Cat(name, age);
                break;
            case "bird":
                animal = new Bird(name, age);
                break;
            default:
                System.out.println("Invalid animal type!");
                return;
        }
        animal.makeSound();
    }
}