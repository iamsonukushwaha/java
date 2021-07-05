import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        String data = "This is a test Data.";
        try {
            // create a Writer using FileWriter
            FileWriter output  = new FileWriter("testFile.txt");

            // write string to the file
            output.write(data);
            System.out.println("Data is written to the file.");

            // close the writer
            output.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}