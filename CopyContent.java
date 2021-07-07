import java.io.FileReader;
import java.io.FileWriter;

public class CopyContent {
    public static void main(String[] args) {
        char[] contents = new char[1000];

        try {
            FileReader sourceFile = new FileReader("input.txt");
            FileWriter destFile = new FileWriter("output.txt");

            // reads all data from input.txt
            sourceFile.read(contents);

            // writes all data from output.txt
            destFile.write(contents);

            // close streams
            sourceFile.close();
            destFile.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
