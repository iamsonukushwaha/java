import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        n = input.nextInt();
        input.close();
        System.out.println("Entered integer is " + n);

    }
}