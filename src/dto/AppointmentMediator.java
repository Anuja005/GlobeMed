/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import dao.AppointmentDAO;
import java.sql.SQLException;
import java.util.List;
import model.Appointment;
/**
 *
 * @author ANUJA
 */


public class AppointmentMediator {
    private AppointmentDAO appointmentDAO;

    public AppointmentMediator() {
        this.appointmentDAO = new AppointmentDAO();
    }

    public boolean scheduleAppointment(Appointment appointment) {
        try {
            return appointmentDAO.addAppointment(appointment);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Appointment> fetchAppointments() {
        try {
            return appointmentDAO.getAllAppointments();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
