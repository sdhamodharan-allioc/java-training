package com.training.day24.jdbc.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateSample {
/**
 * Update PreparedStatement JDBC Example
 */
    private static final String UPDATE_college_SQL = "update college \n" +
        "set collegename = ? " +
        "where collegecode = ? ;";

    public static void main(String[] argv) throws SQLException {
        UpdateSample updateStatementExample = new UpdateSample();
        updateStatementExample.updateRecord();
    }

    public void updateRecord() throws SQLException {
      //  String UPDATE_college_SQL = null;
        System.out.println(UPDATE_college_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = JDBCUtils.getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_college_SQL)) {
            preparedStatement.setString(1, "Gtech");
            preparedStatement.setInt(2, 200);

            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            JDBCUtils.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}
