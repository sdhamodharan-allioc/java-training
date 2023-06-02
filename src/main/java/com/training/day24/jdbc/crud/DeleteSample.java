package com.training.day24.jdbc.crud;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSample {

/**
 * Delete Statement JDBC Example
 */


    private static final String DELETE_college_SQL = "delete from college where collegecode = 300";

    public static void main(String[] argv) throws SQLException {
        DeleteSample deleteSample = new DeleteSample();
        deleteSample.deleteRecord();
    }
        public void deleteRecord () throws SQLException {
            System.out.println(DELETE_college_SQL);

            // Step 1: Establishing a Connection
            try (Connection connection = JDBCUtils.getConnection();

                 // Step 2:Create a statement using connection object
                 Statement statement = connection.createStatement();) {

                // Step 3: Execute the query or update query
                int result = statement.executeUpdate(DELETE_college_SQL);
                System.out.println("Number of records affected :: " + result);
            } catch (SQLException e) {

                // print SQL exception information
                printSQLException(e);
            }

            // Step 4: try-with-resource statement will auto close the connection.
        }

        public static void printSQLException (SQLException ex){
            for (Throwable e : ex) {
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
