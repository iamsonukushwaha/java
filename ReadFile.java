import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        char[] contents = new char[1000];
        try {
            // create a reader using the FileReader
            FileReader input = new FileReader("guide.txt");
            // read characters
            input.read(contents);
            System.out.println("Data in the file : ");
            System.out.println(contents);

            // close the reader
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
