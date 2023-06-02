package com.training.day25.batchjdbc;

import java.sql.BatchUpdateException;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.sql.Statement;
        import java.util.Arrays;

/**
 * Insert Batch operation using Statement Interface
 *
 */
public class BatchSample {

    public static void main(String[] args) {
        batchUpdate();
    }
    private static void batchUpdate() {
        try (Connection connection = DriverManager
                .getConnection("jdbc:mariadb://localhost:3306/java_training",
                        "root", "MariaDB@123");
             // Step 2:Create a statement using connection object
             Statement statement = connection.createStatement()) {
            connection.setAutoCommit(false);
            statement.addBatch("INSERT INTO college VALUES (120, 'Mgr', 'Chennai', 'mgr@gmail.com' );");
            statement.addBatch("INSERT INTO college VALUES (121, 'Bharat','Badrapalli', 'bharat@gmail.com');");
            statement.addBatch("INSERT INTO college VALUES (142, 'Vit', 'Vellore','vit@gmail.com');");
            int[] updateCounts = statement.executeBatch(); // {1st, 2nd,3rd,4th,5th}
            System.out.println(Arrays.toString(updateCounts));
            connection.commit();
        } catch (BatchUpdateException batchUpdateException) {
            printBatchUpdateException(batchUpdateException);
        } catch (SQLException e) {
            printSQLException(e);
        }
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

    public static void printBatchUpdateException(BatchUpdateException b) {

        System.err.println("----BatchUpdateException----");
        System.err.println("SQLState:  " + b.getSQLState());
        System.err.println("Message:  " + b.getMessage());
        System.err.println("Vendor:  " + b.getErrorCode());
        System.err.print("Update counts:  ");
        int[] updateCounts = b.getUpdateCounts();

        for (int i = 0; i < updateCounts.length; i++) {
            System.err.print(updateCounts[i] + "   ");
        }
    }
}
