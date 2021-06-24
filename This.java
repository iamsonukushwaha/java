public class This {
    int a;
    This(int a) {
        this.a = a;
    // print this keyword

    System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        // call the constructor
        This obj = new This(8);

        // print the object
        System.out.println("object reference = " + obj);
    }

}