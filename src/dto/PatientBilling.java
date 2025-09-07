/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import dto.payment.PaymentStrategy;
/**
 *
 * @author ANUJA
 */


public class PatientBilling extends BillingBridge {

    public PatientBilling(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }

    @Override
    public void pay(String amount) {
        System.out.println(paymentStrategy.processPayment(amount));
    }
}