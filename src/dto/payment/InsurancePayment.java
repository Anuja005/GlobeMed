/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto.payment;

/**
 *
 * @author ANUJA
 */
public class InsurancePayment implements PaymentStrategy {
    @Override
    public String processPayment(String amount) {
        return "Covered " + amount + " by Insurance";
    }
}