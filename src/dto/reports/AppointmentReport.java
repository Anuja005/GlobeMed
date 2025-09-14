/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.reports;

/**
 *
 * @author ANUJA
 */
public class AppointmentReport implements ReportElement {
    private String patientName;
    private String doctorName;
    private String appointmentDate;
    private String appointmentTime;
    private String status;

    public AppointmentReport(String patientName, String doctorName, String appointmentDate, String appointmentTime, String status) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.status = status;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}