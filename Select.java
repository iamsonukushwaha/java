import java.sql.*;

public class Select {
    public static void main(String[] args) {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // Establish a connection to the MySQL database
            String url = "jdbc:mysql://localhost:3306/sonu";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url, username, password);

            // Create a SQL statement
            String sql = "SELECT * FROM students";
            Statement stmt = conn.createStatement();

            // Execute the SQL statement and retrieve the result set
            ResultSet rs = stmt.executeQuery(sql);

            // Process the result set
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + "\t" + name);
            }

            // Close the JDBC objects
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
