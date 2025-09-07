/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.*;
import model.Appointment;
import util.Database;

/**
 *
 * @author ANUJA
 */

public class AppointmentDAO {

    public boolean addAppointment(Appointment appointment) throws SQLException {
        Connection conn = Database.getInstance().getConnection();
        String sql = "INSERT INTO admin_appointment (patient_name, doctor_name, appointment_date, appointment_time, status) "
                   + "VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        pst.setString(1, appointment.getPatientName());
        pst.setString(2, appointment.getDoctorName());
        pst.setDate(3, new java.sql.Date(appointment.getAppointmentDate().getTime()));
        pst.setString(4, appointment.getAppointmentTime());
        pst.setString(5, appointment.getStatus());

        int rows = pst.executeUpdate();
        return rows > 0;
    }

    public List<Appointment> getAllAppointments() throws SQLException {
        List<Appointment> appointments = new ArrayList<>();
        Connection conn = Database.getInstance().getConnection();
        String sql = "SELECT * FROM admin_appointment";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            appointments.add(new Appointment(
                    rs.getInt("appointment_id"),
                    rs.getString("patient_name"),
                    rs.getString("doctor_name"),
                    rs.getDate("appointment_date"),
                    rs.getString("appointment_time"),
                    rs.getString("status")
            ));
        }
        return appointments;
    }
}
