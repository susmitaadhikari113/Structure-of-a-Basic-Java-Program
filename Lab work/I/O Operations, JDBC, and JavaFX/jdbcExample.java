import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Change to your database URL
        String user = "root"; // Change to your database username
        String password = "root"; // Change to your database password

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database!");

            Statement statement = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users"); // Change to your table name

            while (rs.next()) {
                System.out.println("User  ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}