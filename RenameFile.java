import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldFile = new File("input.txt");
        File newFile = new File("newName.txt");

        // change the name of the file
        boolean value = oldFile.renameTo(newFile);

        if(value) {
            System.out.println("The name of the file is changed.");
        } else {
            System.out.println("The name can not be changed.");

        }
    }
}
