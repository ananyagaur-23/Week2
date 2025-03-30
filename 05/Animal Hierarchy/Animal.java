import java.util.Scanner;
class Animal{
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    void makeSound(){
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal{
    Dog(String name, int age){
        super(name, age);
    }
    void makeSound(){
        System.out.println(name+" says: Bark");
    }
}
 class Cat extends Animal{
    Cat(String name, int age){
        super(name, age);
    }
    void makeSound(){
        System.out.println(name+ " says: Meow");
    }
 }

 class Bird extends Animal{
    Bird(String name, int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println(name+" says: Chirp");
    }
 }