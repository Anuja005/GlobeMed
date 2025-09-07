/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
/**
 *
 * @author ANUJA
 */

public class Appointment {
    private int appointmentId;
    private String patientName;
    private String doctorName;
    private Date appointmentDate;
    private String appointmentTime;
    private String status;

    public Appointment(int appointmentId, String patientName, String doctorName, Date appointmentDate, String appointmentTime, String status) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.status = status;
    }

    public Appointment(String patientName, String doctorName, Date appointmentDate, String appointmentTime, String status) {
        this(0, patientName, doctorName, appointmentDate, appointmentTime, status);
    }

    public int getAppointmentId() { return appointmentId; }
    public String getPatientName() { return patientName; }
    public String getDoctorName() { return doctorName; }
    public Date getAppointmentDate() { return appointmentDate; }
    public String getAppointmentTime() { return appointmentTime; }
    public String getStatus() { return status; }
}
