package org.example.java_fundamentals._04_decisionmaking;

import java.util.Scanner;

public class _01_RestaurantBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0 ;
        int serviceAmount = 0;

        System.out.println("=== Welcome to Golden Spoon ===");
        System.out.println("1. View Food Prices\n" +
                "2. Order Food\n" +
                "3. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.println("Burger → $8\n" +
                    "\n" +
                    "Pizza → $12\n" +
                    "\n" +
                    "Pasta → $10");

        } else if (choice ==2 ) {
            System.out.print("Enter food item (burger, pizza, pasta): ");
            String food = scanner.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Do you want service charge? (yes/no): ");
            String serviceCharge = scanner.nextLine();

            if (serviceCharge.equalsIgnoreCase("yes")){
                int serviceYes = 5;
                serviceAmount += serviceYes;
            } else if (serviceCharge.equalsIgnoreCase("no")){
                int serviceNo = 0;
                serviceAmount += serviceNo;
            }else {
                System.out.println("Invalid input.");
            }



            if (food.equalsIgnoreCase("burger")){
                double totalBurger = 8 * quantity ;
                total += totalBurger;
            } else if (food.equalsIgnoreCase("pizza")) {
                double totalPizza = 12 * quantity ;
                total += totalPizza;
            } else if (food.equalsIgnoreCase("pasta")) {
                double totalPasta = 10 * quantity ;
                total += totalPasta;
            }else {
                System.out.println("Invalid input. Please try again!");
            }

            double discount = total > 50 ? 0.1 * total : 0 ;

            System.out.println("Total before discount: $" + total);
            System.out.println("Discount applied: $" + discount);
            System.out.println("Service charge: " + serviceAmount);
            System.out.println("Final bill: $" + (total - discount + serviceAmount));


        } else if (choice == 3) {
            System.out.println("Thank you for visiting ");

        }else {
            System.out.println("Invalid input. Please try again.");

        }


    }
}
