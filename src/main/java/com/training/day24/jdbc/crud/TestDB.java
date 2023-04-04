package com.training.day24.jdbc.crud;// Java Program to Retrieve Contents of a Table Using JDBC
// connection

// Showing linking of created database

// Importing SQL libraries to create database
import java.sql.*;

public class TestDB {

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
        }
        catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
        //1. Get connection
        Connection conn = getConnection();
        //2. Create Statement.
        Statement stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT * FROM EMPLOYEE");

        while(resultSet.next()){
            System.out.println("ID : "+ resultSet.getInt(1));
            System.out.println("Name : "+resultSet.getString(2));

            System.out.println("--ID : "+resultSet.getInt("EMPLOYEE_ID"));
            System.out.println("--Name : "+resultSet.getString("EMPLOYEE_NAME"));
        }
    }
}
