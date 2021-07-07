import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        // create a file object
        File file = new File("newFile.txt");

        // delete the file
        boolean value = file.delete();

        if(value) {
            System.out.println("The file is deleted.");
        } else {
            System.out.println("The file is NOT deleted.");

        }
    }
}