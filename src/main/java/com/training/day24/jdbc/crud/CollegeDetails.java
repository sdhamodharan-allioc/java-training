package com.training.day24.jdbc.crud;

import java.sql.*;

public class CollegeDetails {

    Connection con = null;

    public static Connection getConnection() throws SQLException {

        final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
        try {
            // Importing and registering drivers
            Class.forName(JDBC_DRIVER);

            Connection con = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/java_training",
                    "root", "MariaDB@123");
            // here,root is the username and 1234 is the
            // password,you can set your own username and
            // password.
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
        //1. Get connection
        Connection conn;
        conn = getConnection();
        //2. Create Statement.
        Statement stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT * FROM college");

        while (resultSet.next()) {
            System.out.println("College code : " + resultSet.getInt(1));
            System.out.println("College Name : " + resultSet.getString(2));
            System.out.println("College Address : " + resultSet.getString(3));
            System.out.println("College Email-id : " + resultSet.getString(4));

            System.out.println("--College code : " + resultSet.getInt("collegecode"));
            System.out.println("--College Name : " + resultSet.getString("collegename"));
            System.out.println("--College Address : " + resultSet.getString("college_address"));
            System.out.println("--College Email_id : " + resultSet.getString("college_emailid"));
        }
    }
}