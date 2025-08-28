/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {

   
    private static final String URL = "jdbc:mysql://localhost:3306/globmed";


    private static final String USER = "root";
    private static final String PASSWORD = "anuja";

   
    private Connection connection;

    
    private static Database instance;

    private Database() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
          
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet SELECT(String query) throws SQLException {
        Connection connection = getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        return statement.executeQuery();
    }
    
    public static ResultSet SELECT(PreparedStatement statement) throws SQLException {
        return statement.executeQuery();
    }

    public static void IUD(String query) throws SQLException {
        Connection connection = getInstance().getConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.executeUpdate();
    }

}

