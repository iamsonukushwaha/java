import java.sql.*;

public class Delete {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database using a JDBC URL
            String url = "jdbc:mysql://localhost:3306/sonu";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url, username, password);

            // Create a Statement object and execute a DELETE statement
            Statement stmt = conn.createStatement();
            int rowsDeleted = stmt.executeUpdate("DELETE FROM students WHERE id = 1");

            // Process the results of the DELETE statement
            System.out.println(rowsDeleted + " row(s) deleted.");

            // Close the JDBC objects
            stmt.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
