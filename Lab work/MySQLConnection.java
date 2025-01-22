import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnection {
    public static void main(String[] args) {
        // Database URL, username, and passwexord
        String url = "jdbc:mysql://localhost:3306/CollegeManagement"; // Replace 'testdb' with your database name
        String username = "root"; // Replace with your MySQL username
        String password = "root"; // Replace with your MySQL password

        // Establish the connection
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database!");

            // Create a statement object to execute queries
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Students";

            // Execute the query
            ResultSet resultSet = statement.executeQuery(query);

            // Process the results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");

                System.out.printf("ID: %d, Name: %s, Email: %s%n", id, name, email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
