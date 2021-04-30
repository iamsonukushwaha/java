public class Swapping {
    public static void main(String args[]) {
        System.out.println("Entered values are " + args[0] + " and " + args[1]);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("values after swapping are " + a + " and " + b);
    }
}