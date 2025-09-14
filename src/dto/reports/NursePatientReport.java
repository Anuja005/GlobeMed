/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.reports;

/**
 *
 * @author ANUJA
 */
public class NursePatientReport implements ReportElement {
    private String patientName;
    private String age;
    private String medicationGiven;
    private String allergies;
    private String lastVisitDate;

    public NursePatientReport(String patientName, String age, String medicationGiven, String allergies, String lastVisitDate) {
        this.patientName = patientName;
        this.age = age;
        this.medicationGiven = medicationGiven;
        this.allergies = allergies;
        this.lastVisitDate = lastVisitDate;
    }

    public String getPatientName() { return patientName; }
    public String getAge() { return age; }
    public String getMedicationGiven() { return medicationGiven; }
    public String getAllergies() { return allergies; }
    public String getLastVisitDate() { return lastVisitDate; }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}
