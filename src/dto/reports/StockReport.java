/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.reports;

/**
 *
 * @author ANUJA
 */
public class StockReport implements ReportElement {
    private String medicineName;
    private String quantity;
    private String pricePerUnit;
    private String expiryDate;
    private String status;

    public StockReport(String medicineName, String quantity, String pricePerUnit, String expiryDate, String status) {
        this.medicineName = medicineName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.expiryDate = expiryDate;
        this.status = status;
    }

    public String getMedicineName() { return medicineName; }
    public String getQuantity() { return quantity; }
    public String getPricePerUnit() { return pricePerUnit; }
    public String getExpiryDate() { return expiryDate; }
    public String getStatus() { return status; }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}