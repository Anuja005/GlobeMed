/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import dto.StaffMember;
import java.sql.Connection;
import java.sql.PreparedStatement;
import util.Database;

/**
 *
 * @author ANUJA
 */
public class StaffDAO {
    public void saveStaff(StaffMember staff) throws Exception {
        Connection conn = Database.getInstance().getConnection();
        String sql = "INSERT INTO admin_roles (name, user_type, mobile, address, username, password) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setString(1, staff.getName());
        pst.setString(2, staff.getRole());
        pst.setString(3, staff.getMobile());
        pst.setString(4, staff.getAddress());
        pst.setString(5, staff.getUsername());
        pst.setString(6, staff.getPassword());

        pst.executeUpdate();
    }
}