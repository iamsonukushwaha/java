import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        int numerator, denominator;
        double result;
        // take inputs
        System.out.println("Enter numerator and denominator :");
        Scanner input = new Scanner(System.in);
        numerator = input.nextInt();
        denominator = input.nextInt();
        // code that may generate exceptions
        try {
            result = numerator/denominator;
            System.out.println("Result : " + result);
        }
        // if exception occurs, this code is executed
        catch (Exception e) {
            System.out.println("Denominator can not be 0");
            System.out.println("Exception : " + e);
        }

    }
}