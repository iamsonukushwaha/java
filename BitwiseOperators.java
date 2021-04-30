public class BitwiseOperators {
    public static void main(String args[]) {
        int a = 3, b = 5, c = 2;
        
        // bitwise AND
        System.out.println("a & b = " + (a & b));   

        // bitwise OR
        System.out.println("a | b = " + (a | b));   
    
       // bitwise XOR
        System.out.println("a ^ b = " + (a ^ b));    

        // bitwise compliment
        System.out.println("~c = " + (~c));     // bitwise complement of any integer N is equal to -(N + 1)
    }
}