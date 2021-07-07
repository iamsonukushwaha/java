enum Size {
    SMALL, MEDIUM, LARGE
}

public class Enum {
    public static void main(String[] args) {
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
        System.out.println(Size.LARGE);

        // enum variable
        Size pizzaSize;

        // assign enum constant
        pizzaSize = Size.SMALL;

        System.out.println("pizzaSize = " + pizzaSize);
    }
}
