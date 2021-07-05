import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        // create a file object
        // for the current location
        File file = new File("newFile.txt");

        // trying to create a file 
        try {
            boolean value = file.createNewFile();
            if(value) {
                System.out.println("The new file is created.");
            }
            else {
                System.out.println("The file already exists.");
            }
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
