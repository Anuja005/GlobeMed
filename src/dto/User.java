/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author ANUJA
 */

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private int userId;
    private String username;
    private String password;
    private UserType userType;

    public User(int userId, String username, String password, UserType userType) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public int getUserId() { return userId; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public UserType getUserType() { return userType; }

    public static User fromResultSet(ResultSet rs) throws SQLException {
        int id = rs.getInt("user_id");
        String uname = rs.getString("username");
        String pass = rs.getString("password");
        UserType type = UserType.valueOf(rs.getString("user_type"));
        return new User(id, uname, pass, type);
    }
}
