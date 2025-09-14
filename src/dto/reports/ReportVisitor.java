/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.reports;

/**
 *
 * @author ANUJA
 */
public interface ReportVisitor {
    void visit(PatientReport report);
    void visit(BillingReport report);
    void visit(AppointmentReport report);
    void visit(StaffReport report);
    void visit(StockReport report);
    void visit(DoctorPatientReport report);
    void visit(NursePatientReport report);
    void visit(CurrentPatientBillReport report);
}