class Animals {
    // constructor
    Animals(String type) {
        System.out.println("Type : " + type);
    }
    
}

class Dogs extends Animals {
    // constructor
    Dogs() {
        // calls the constructor of Animal

        super("Mammal");
        System.out.println("I am a Dog");

    }
    void eat() {
        System.out.println("I like eating");
    }
}

public class Inherit {
    public static void main(String args[]) {
        Dogs dog1 = new Dogs();
        dog1.eat();
    }
}
