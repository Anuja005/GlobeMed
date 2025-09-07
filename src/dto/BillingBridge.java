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


public abstract class BillingBridge {
    protected PaymentStrategy paymentStrategy;

    public BillingBridge(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public abstract void pay(String amount);
}
