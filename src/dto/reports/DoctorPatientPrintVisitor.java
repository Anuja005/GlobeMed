/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.reports;

import java.awt.*;
import java.awt.print.*;
import javax.swing.*;
/**
 *
 * @author ANUJA
 */
public class DoctorPatientPrintVisitor implements ReportVisitor {

    @Override
    public void visit(DoctorPatientReport report) {
        StringBuilder sb = new StringBuilder();
        sb.append("==================================================\n");
        sb.append("                 GlobeMed Hospital                \n");
        sb.append("            New Town, Anuradhapura                \n");
        sb.append("               Doctor–Patient Report              \n");
        sb.append("==================================================\n\n");
        sb.append("Patient Name    : ").append(report.getPatientName()).append("\n");
        sb.append("Age             : ").append(report.getAge()).append("\n");
        sb.append("Mobile          : ").append(report.getMobile()).append("\n");
        sb.append("Address         : ").append(report.getAddress()).append("\n");
        sb.append("Diagnosis       : ").append(report.getDiagnosis()).append("\n");
        sb.append("Last Visit Date : ").append(report.getLastVisitDate()).append("\n\n");
        sb.append("--------------------------------------------------\n");
        sb.append("For assistance, please contact the billing        \n");
        sb.append("department at GlobeMed Hospital.                  \n");
        sb.append("--------------------------------------------------\n");
        sb.append("      Thank you for trusting GlobeMed!            \n");
        sb.append("==================================================\n");
        sb.append("Contact: (0252077777 / 0773480439)                \n");
        sb.append("==================================================\n");

        print(sb.toString());
    }

    @Override public void visit(PatientReport report) {}
    @Override public void visit(BillingReport report) {}
    @Override public void visit(AppointmentReport report) {}
    @Override public void visit(StaffReport report) {}
    @Override public void visit(StockReport report) {}

    private void print(String text) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable((graphics, pageFormat, pageIndex) -> {
            if (pageIndex > 0) return Printable.NO_SUCH_PAGE;

            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            graphics.setFont(new Font("Monospaced", Font.PLAIN, 12));

            int y = 100;
            for (String line : text.split("\n")) {
                graphics.drawString(line, 100, y);
                y += 15;
            }
            return Printable.PAGE_EXISTS;
        });

        if (job.printDialog()) {
            try { job.print(); }
            catch (PrinterException e) {
                JOptionPane.showMessageDialog(null, "Printing Error: " + e.getMessage());
            }
        }
    }

    @Override
    public void visit(NursePatientReport report) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}