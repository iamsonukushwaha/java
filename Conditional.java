import java.util.Scanner;

public class Conditional {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Enter an integer : ");
        x = input.nextInt();
        input.close();
        // this syntax also runs
        // System.out.printf("%d is an %s \n", x, (x%2 == 0) ? "Even Number" : "Odd Number");  

        String result = (x%2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(x + " is an " + result);
    }
}