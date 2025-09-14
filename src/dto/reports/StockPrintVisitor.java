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
public class StockPrintVisitor implements ReportVisitor {

    @Override
    public void visit(StockReport report) {
        StringBuilder sb = new StringBuilder();
        sb.append("==================================================\n");
        sb.append("                 GlobeMed Hospital                \n");
        sb.append("            New Town, Anuradhapura                \n");
        sb.append("                   Stock Report                   \n");
        sb.append("==================================================\n\n");
        sb.append("Medicine Name   : ").append(report.getMedicineName()).append("\n");
        sb.append("Quantity        : ").append(report.getQuantity()).append("\n");
        sb.append("Price per Unit  : Rs ").append(report.getPricePerUnit()).append("\n");
        sb.append("Expiry Date     : ").append(report.getExpiryDate()).append("\n");
        sb.append("Status          : ").append(report.getStatus()).append("\n\n");
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
}
