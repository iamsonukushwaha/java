import java.sql.*;

public class Insert {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database using a JDBC URL
            String url = "jdbc:mysql://localhost:3306/sonu";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url, username, password);

            // Create a prepared statement and set the parameters
            String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, 1);
            stmt.setString(2, "Sonu");

            // Execute the statement and check the number of rows affected
            int rows = stmt.executeUpdate();
            System.out.println(rows + " rows affected");

            // Close the JDBC objects
            stmt.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
