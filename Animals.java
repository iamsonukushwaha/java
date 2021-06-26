class Animal {
    // constructor
    Animal(String type) {
        System.out.println("Type : " + type);
    }
    
}

class Dog extends Animal {
    // constructor
    Dog() {
        // calls the constructor of Animal

        super("Mammal");
        System.out.println("I am a Dog");

    }
}

public class Animals {
    public static void main(String args[]) {
        Dog dog1 = new Dog();
    }
}