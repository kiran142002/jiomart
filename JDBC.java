/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;

public class JDBC {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=jmdb;trustServerCertificate=true";
    private static final String USER = "kiran";
    private static final String PASSWORD = "kiran";
    
    public static Connection con() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    } 
}
