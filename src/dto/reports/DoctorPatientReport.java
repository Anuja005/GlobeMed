/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.reports;

/**
 *
 * @author ANUJA
 */
public class DoctorPatientReport implements ReportElement {
    private String patientName;
    private String age;
    private String mobile;
    private String address;
    private String diagnosis;
    private String lastVisitDate;

    public DoctorPatientReport(String patientName, String age, String mobile, String address, String diagnosis, String lastVisitDate) {
        this.patientName = patientName;
        this.age = age;
        this.mobile = mobile;
        this.address = address;
        this.diagnosis = diagnosis;
        this.lastVisitDate = lastVisitDate;
    }

    public String getPatientName() { return patientName; }
    public String getAge() { return age; }
    public String getMobile() { return mobile; }
    public String getAddress() { return address; }
    public String getDiagnosis() { return diagnosis; }
    public String getLastVisitDate() { return lastVisitDate; }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}
