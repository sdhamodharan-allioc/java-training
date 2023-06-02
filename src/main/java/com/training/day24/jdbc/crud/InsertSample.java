package com.training.day24.jdbc.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertSample {
    private static final String INSERT_college_SQL = "INSERT INTO college" +
            "  (collegecode, collegename,college_address,college_emailid ) VALUES " +
            " (?, ?, ?, ?);";

    public static void main(String[] argv) throws SQLException {
        InsertSample createTableExample = new InsertSample();
        createTableExample.insertRecord();
    }

    public void insertRecord() throws SQLException {
        System.out.println(INSERT_college_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = JDBCUtils.getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_college_SQL)) {
            preparedStatement.setInt(1, 600);
            preparedStatement.setString(2, "CIT");
            preparedStatement.setString(3, "Chennai");
            preparedStatement.setString(4, "cit@gmail.com");

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
