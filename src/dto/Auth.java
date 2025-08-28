/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.Database;

/**
 *
 * @author ANUJA
 */
public class Auth {

    private int userID;
    private final String username;
    private final String password;
    private User user;
    private final UserType authType;

    public Auth(String username, String password, UserType authType) {
        this.username = username;
        this.password = password;
        this.authType = authType;
    }

    public String getUsername() {
        return this.username;
    }
    
    private String getPassword(){
        return this.password;
    }

    public User getUser() {
        return this.user;
    }

    public int getUserID() {
        return this.userID;
    }

    public UserType getAuthType() {
        return this.authType;
    }

    public boolean isAuthenticated() throws Exception {

        Database instance = Database.getInstance();
        Connection connection = instance.getConnection();
        String query = "SELECT * FROM  users  WHERE users.username = ? AND users.password = ? AND users.user_type = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, username);
        statement.setString(2, password);
        statement.setString(3, authType.name());
        ResultSet results = statement.executeQuery();
        if (results.next()) {
            user =  User.fromResultSet(results);
            userID = user.getUserId();
            return true;
        }

        return false;
    }
}