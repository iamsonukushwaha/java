import java.util.Scanner;

public class Message {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name ");
        String name = input.nextLine();
        System.out.println("Please enter your age ");
        int age = input.nextInt();
        System.out.print("\033[H\033[2J");  // clear the console  " found this command on internet"
        System.out.println("Hi " + name + " you are " + age + " years old ");
    }
}