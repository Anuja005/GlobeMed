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
public class StaffPrintVisitor implements ReportVisitor {

    public void visit(StaffReport report) {
        StringBuilder sb = new StringBuilder();
        sb.append("==================================================\n");
        sb.append("                 GlobeMed Hospital                \n");
        sb.append("            New Town, Anuradhapura                \n");
        sb.append("                   Staff Report                   \n");
        sb.append("==================================================\n\n");
        sb.append("Name       : ").append(report.getName()).append("\n");
        sb.append("Role       : ").append(report.getRole()).append("\n");
        sb.append("Mobile     : ").append(report.getMobile()).append("\n");
        sb.append("Address    : ").append(report.getAddress()).append("\n");
        sb.append("Username   : ").append(report.getUsername()).append("\n");
        sb.append("Password   : ").append(report.getPassword()).append("\n\n");
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
    public void visit(StockReport report) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void visit(DoctorPatientReport report) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void visit(NursePatientReport report) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

