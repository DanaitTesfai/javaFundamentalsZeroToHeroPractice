package org.example.java_fundamentals._05_looping._02_mini_projects;

import java.util.Scanner;

public class _01_HotelBillingSytem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Hotel Billing System ===");

        System.out.print("How many guests today? ");
        int guests = input.nextInt();
        input.nextLine();

        double individualTotal = 0 ;
        double totalIncome = 0 ;

        for(int i = 1 ; i <= guests; i++){
            System.out.println("--- Guest #" + (i) + " ---");
            System.out.print("Enter guest name: ");
            String name = input.nextLine();

            System.out.print("Enter number of nights: ");
            int nights = input.nextInt();

            System.out.print("Enter price per night: ");
            double nightlyPrice = input.nextDouble();
            input.nextLine();

            individualTotal = nights * nightlyPrice ;
            totalIncome += individualTotal ;

            System.out.println("--- BILL SUMMARY ---");
            System.out.println("Customer: " + name);
            System.out.println("Nights: " + nights);
            System.out.println("Nightly Rate: $" + nightlyPrice);
            System.out.println("Total amount: $" + individualTotal);
        }
        System.out.println("=== end of day report ===".toUpperCase());
        System.out.println("Total income: $" + totalIncome );
    }
}
