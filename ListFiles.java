import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File file = new File("sonu");
        
        // returns an array of all files
        String[] fileList  = file.list();
        for(String str: fileList) {
            System.out.println(str);
        }
    }
}
