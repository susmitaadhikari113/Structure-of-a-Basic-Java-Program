package com.classlearning.database;
import java.sql.*;
public class DatabaseConnection {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/sem3";
    private static final String userName = "root";
    private static final String password = "macbook@123";
    Connection connection = null;

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        try {
            // JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
        } catch (Exception e) {
            System.out.println("System errors " + e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to database");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Students");
            while (resultSet.next()) {
                int StudentID = resultSet.getInt("StudentID");
                String FirstName = resultSet.getString("FirstName");
                String LastName = resultSet.getString("LastName");
                String Email = resultSet.getString("Email");
                int DateOfBirth = resultSet.getInt("DateOfBirth")  
                System.out.println("StudentID " + StudentID);
                System.out.println("FirstName " + FirstName);
                System.out.println("LastName" + LastName);
                System.out.println("Email " + Email);
                System.out.println("DateOfBirth " + DateOfBirth);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("System error " + e.getMessage());
        }
    }
}