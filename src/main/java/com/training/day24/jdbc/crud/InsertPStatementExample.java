package com.training.day24.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Insert PrepareStatement JDBC Example
 * 
 */
public class InsertPStatementExample {
    private static final String INSERT_USERS_SQL = "INSERT INTO users" +
        "  (id, name, email, country, password) VALUES " +
        " (?, ?, ?, ?, ?);";

    public static void main(String[] argv) throws SQLException {
        InsertPStatementExample createTableExample = new InsertPStatementExample();
        createTableExample.insertRecord();
    }

    public void insertRecord() throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = JDBCUtils.getConnection();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 600);
            preparedStatement.setString(2, "Tony Tylor");
            preparedStatement.setString(3, "tonyss@gmail.com");
            preparedStatement.setString(4, "US");
            preparedStatement.setString(5, "secret");

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
        	JDBCUtils.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}
