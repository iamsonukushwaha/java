class Factorial {
    int fact(int n) {
        int result;
        if(n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorial of 1 is " + f.fact(1));
        System.out.println("Factorial of 6 is " + f.fact(6));
        System.out.println("Factorial of 12 is " + f.fact(12));
    }
}
