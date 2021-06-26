class Animal {
    String name;
    public void eat() {
        System.out.println("I am an animal");
        System.out.println("I can eat");
    } 
    public void makeSound() {
        System.out.println("making animal sound");
    }
}

class Dog extends Animal {
    public void display() {
        System.out.println("My name is " + name);
    }
    public void makeSound() {
        super.makeSound();
        System.out.println("Woof Woof");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Bull Dog";
        dog1.eat();

        dog1.display();
        dog1.makeSound();
    }
}