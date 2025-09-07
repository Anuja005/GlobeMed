/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.sql.Date;
/**
 *
 * @author ANUJA
 */
public class Billings {
    private int billingId;
    private String patientName;
    private String doctorName;
    private String totalAmount;
    private Date dateIssued;
    private String paymentStatus;

    public Billings(String patientName, String doctorName, String totalAmount, Date dateIssued, String paymentStatus) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.totalAmount = totalAmount;
        this.dateIssued = dateIssued;
        this.paymentStatus = paymentStatus;
    }

    // Getters
    public int getBillingId() { return billingId; }
    public String getPatientName() { return patientName; }
    public String getDoctorName() { return doctorName; }
    public String getTotalAmount() { return totalAmount; }
    public Date getDateIssued() { return dateIssued; }
    public String getPaymentStatus() { return paymentStatus; }
}