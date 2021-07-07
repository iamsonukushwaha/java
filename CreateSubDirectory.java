import java.io.File;

public class CreateSubDirectory {
    public static void main(String[] args) {
        // create a file object with specified path
        File file = new File("movies/pk");

        // create a new  directory
        boolean value = file.mkdir();

        if(value) {
            System.out.println("The  subdirectory is created.");
        } else {
            System.out.println("The subdirectory already exists.");

        }
    }
}