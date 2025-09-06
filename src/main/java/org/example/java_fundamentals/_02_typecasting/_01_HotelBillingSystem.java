package org.example.java_fundamentals._02_typecasting;

import java.util.Scanner;

public class _01_HotelBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Hotel Billing System ===");

        System.out.print("Enter guest name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of nights: ");
        int nights = scanner.nextInt();

        System.out.print("Enter price per night: ");
        double nightlyPrice = scanner.nextDouble();

        double total = nights * nightlyPrice ;

        System.out.println("--- bill summary ---".toUpperCase());
        System.out.println("Customer: " + name.toUpperCase());
        System.out.println("Nights: " + nights);
        System.out.println("Nightly Rate: $" + nightlyPrice);
        System.out.println("Total amount: $" + total);

    }
}
