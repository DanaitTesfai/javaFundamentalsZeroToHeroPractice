package org.example.java_fundamentals._07_OOP._07_interface._08_paymentSystem;

public class UpiPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI");
    }
}
