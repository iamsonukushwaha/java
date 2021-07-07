import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        // create a file object
        File file = new File("movies");

        // create a new  directory
        boolean value = file.mkdir();

        if(value) {
            System.out.println("The new directory is created.");
        } else {
            System.out.println("The directory already exists.");

        }
    }
}
