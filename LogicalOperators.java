public class LogicalOperators {
    public static void main(String args[]) {
        int i = 20, j = 10;
        
        System.out.println((i == 20) && (j == 12));   // logical AND

        System.out.println((i == 20) || (j == 12));   // logical OR

        System.out.println(!(j > i));   // logical NOT
    }
}