package com.training.day25.batchjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Simple CallableStatement Example
 */
public class CallableStatementSample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mariadb://localhost:3306/java_training";
        String username = "root";
        String password = "MariaDB@123";
        String sql = "call retrieve_colleges()";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
             CallableStatement stmt = conn.prepareCall(sql);
             ResultSet rs = stmt.executeQuery();) {

            while (rs.next()) {
                System.out.println("CollegeCode = " + rs.getInt(1) + ", CollegeNAME = " + rs.getString(2) + ", CollegeAddress = " +
                        rs.getString(3) + ", EmailId = " + rs.getString(4) );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
