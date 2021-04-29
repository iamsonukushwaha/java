public class UnaryArithmetic {
    public static void main(String args[]) {
        int i = 20, result;
        result = +i;    // unary plus
        System.out.println(result);
        result = -i;    // unary minus
        System.out.println(result);
        result = ++i;   // pre increment
        System.out.println(result);
        result = --i;   // pre decrement
        System.out.println(result);
        result = i++;   // post increment
        System.out.println(result);
        result = i--;   // pre decrement
        System.out.println(result);
    }
}