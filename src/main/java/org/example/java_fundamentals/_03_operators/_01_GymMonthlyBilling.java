package org.example.java_fundamentals._03_operators;

import java.util.Scanner;

public class _01_GymMonthlyBilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double monthlyFee = 30 ;

        System.out.print("Enter number of months: ");
        int months = scanner.nextInt();

        double totalBeforeDiscount = monthlyFee * months ;

        double discount = months > 6 ? 20 : 0 ;

        double finalTotal = totalBeforeDiscount - discount ;

        System.out.println("Total before discount: $" + totalBeforeDiscount);
        System.out.println("Discount applied: $" + discount);
        System.out.println("Final total: $" + finalTotal);

    }
}
