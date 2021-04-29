// imports all class

import sonu.*;

// imports every single class

// import sonu.Name;
// import sonu.Age;

public class TestPackageSonu {
    public static void main(String args[]) {
        sonu.Name name = new  sonu.Name();
        name.sayName();
        sonu.Age age = new  sonu.Age();
        age.sayAge();
    }
}