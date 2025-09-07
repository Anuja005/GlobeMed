/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.Billings;
import java.sql.Connection;
import java.sql.PreparedStatement;
import util.Database;

/**
 *
 * @author ANUJA
 */

public class BillingDAO {
    public void saveBilling(Billings billing) throws Exception {
        Connection conn = Database.getInstance().getConnection();
        String sql = "INSERT INTO admin_billing (patient_name, doctor_name, total_amount, date_issued, payment_status) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setString(1, billing.getPatientName());
        pst.setString(2, billing.getDoctorName());
        pst.setString(3, billing.getTotalAmount());
        pst.setDate(4, billing.getDateIssued());
        pst.setString(5, billing.getPaymentStatus());

        pst.executeUpdate();
    }
}