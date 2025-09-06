package org.example.java_fundamentals._03_operators;

import java.util.Scanner;

public class _03_RestaurantBillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Meal cost: ");
        double mealCost = input.nextDouble();

        double serviceCharge = 0.1 * mealCost ;

        double total = mealCost + serviceCharge ;

        String paymentOption = total > 200 ? "Pay by card" : "Pay by Cash" ;

        System.out.println("Service Charge: $" + serviceCharge);
        System.out.println("Total Bill: $" + total);
        System.out.println(paymentOption);
    }
}
