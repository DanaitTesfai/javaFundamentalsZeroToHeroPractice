package org.example.java_fundamentals._04_decisionmaking;

import java.util.Scanner;

public class _02_CarRentalSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double insuranceAmount = 0;
        double total = 0 ;

        System.out.println("=== Welcome to DriveEasy Rentals ===");
        System.out.println("1. View Car Prices\n" +
                "2. Rent a Car\n" +
                "3. Exit");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1){
            System.out.println("Economy → $40/day\n" +
                    "\n" +
                    "SUV → $70/day\n" +
                    "\n" +
                    "Luxury → $120/day");
        } else if (choice == 2) {
            System.out.print("Enter car type (economy, suv, luxury): ");
            String carType = input.nextLine();

            System.out.print("Enter number of days: ");
            int days = input.nextInt();
            input.nextLine();

            System.out.print("Do you want insurance? (yes/no): ");
            String insurance = input.nextLine();



            if (insurance.equalsIgnoreCase("yes")){
                double insuranceYes = 15 * days;
                insuranceAmount += insuranceYes;
            }



            if (carType.equalsIgnoreCase("economy")){
                double totalEconomy = 40 * days;
                total += totalEconomy;
            } else if (carType.equalsIgnoreCase("suv")) {
                double totalSuv = 70 * days;
                total += totalSuv;
            } else if ((carType.equalsIgnoreCase("luxury"))) {
                double totalLuxury = 120 * days;
                total += totalLuxury;
            }else {
                System.out.println("Invalid input.");
            }

            double discount = days > 10 ? 0.20 * total : 0;

            System.out.println("Total before discount: $" + total);
            System.out.println("Discount applied: $" + discount);
            System.out.println("Insurance amount: $" + insuranceAmount);
            System.out.println("Final price: $" + (total - discount + insuranceAmount));

        } else if (choice == 3) {
            System.out.println("Thank you for renting a car from us.");

        }else {
            System.out.println("Invalid input.");
        }

    }
}
