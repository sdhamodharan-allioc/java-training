package com.training.day24.jdbc.crud;

import com.training.day24.jdbc.crud.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SetValueSample {
/**
 * Select PreparedStatement JDBC Example
 */
    private static final String QUERY = "select collegecode,collegename,college_address,college_emailid from college where collegecode = ?";

    public static void main(String[] args) {

        // using try-with-resources to avoid closing resources (boiler plate code)

        // Step 1: Establishing a Connection
        try (Connection connection = JDBCUtils.getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY);) {
            preparedStatement.setInt(1, 200);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int collegecode = rs.getInt("collegecode");
                String collegename = rs.getString("collegename");
                String college_address = rs.getString("college_address");
                String college_email = rs.getString("college_emailid");
                System.out.println(collegecode + "," + collegename + "," + college_address + "," + college_email );
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        // Step 4: try-with-resource statement will auto close the connection.
    }
}