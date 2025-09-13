/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.reports;

/**
 *
 * @author ANUJA
 */
public class PatientReport implements ReportElement {
    private String patientName;
    private String mobile;
    private String address;

    public PatientReport(String patientName, String mobile, String address) {
        this.patientName = patientName;
        this.mobile = mobile;
        this.address = address;
    }

    public String getPatientName() { return patientName; }
    public String getMobile() { return mobile; }
    public String getAddress() { return address; }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}
