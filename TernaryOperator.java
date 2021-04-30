public class TernaryOperator {  // conditional operator

    public static void main(String args[]) {
        int a = 3, b = -10, c;
        
        c = a > b ? (a - b) : (b - a);
        System.out.println(c);   
    }
}