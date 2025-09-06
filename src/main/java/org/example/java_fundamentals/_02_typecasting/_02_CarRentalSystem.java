package org.example.java_fundamentals._02_typecasting;

import java.util.Scanner;

public class _02_CarRentalSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Car Rental Invoice Generator ===");

        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter number of rental days: ");
        int days = input.nextInt();

        System.out.print("Enter daily rental rate (whole number): ");
        int dailyRate = input.nextInt();

        double total = days * dailyRate ;

        System.out.println("----- Invoice -----");
        System.out.println("Customer Name: " + name);
        System.out.println("Days Rented: " + days);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Amount Due: $" + total);

    }
}
