package com.training.day24.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Select Statement JDBC Example
 *
 */
public class RetrieveResults {
    private static final String QUERY = "select roll_no,name from student";

    public static void main(String[] args) throws Exception {

        // using try-with-resources to avoid closing resources (boilerplate code)

    	//DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        // Step 1: Establishing a Connection
        try (
        	Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/learning?useSSL=false", "root", "Qwerty!1255");

            // Step 2:Create a statement using connection object
            Statement stmt = connection.createStatement();

            // Step 3: Execute the query or update query
            ResultSet rs = stmt.executeQuery(QUERY)) {

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("roll_no");
                String name = rs.getString("name");
                System.out.println(id + "," + name);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        // Step 4: try-with-resource statement will auto close the connection.
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}