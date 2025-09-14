/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.reports;

/**
 *
 * @author ANUJA
 */
public class BillingReport implements ReportElement {
    private String patientName;
    private String doctorName;
    private String totalAmount;
    private String dateIssued;
    private String paymentStatus;

    public BillingReport(String patientName, String doctorName, String totalAmount, String dateIssued, String paymentStatus) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.totalAmount = totalAmount;
        this.dateIssued = dateIssued;
        this.paymentStatus = paymentStatus;
    }

    public String getPatientName() { return patientName; }
    public String getDoctorName() { return doctorName; }
    public String getTotalAmount() { return totalAmount; }
    public String getDateIssued() { return dateIssued; }
    public String getPaymentStatus() { return paymentStatus; }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}