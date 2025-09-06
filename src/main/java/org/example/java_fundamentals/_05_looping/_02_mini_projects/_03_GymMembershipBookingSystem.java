package org.example.java_fundamentals._05_looping._02_mini_projects;

import java.util.Scanner;

public class _03_GymMembershipBookingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double discount = 0 ;
        int basicMonths = 0, premiumMonths = 0, vipMonths = 0;
        double basicTotal = 0, premiumTotal = 0 , vipTotal = 0;

        System.out.println("=== Welcome to FitLife Gym ===");

        while (true) {
            System.out.println("1. View Membership Prices\n" +
                    "2. Register for Membership\n" +
                    "3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("Basic: $30/month\n" +
                        "Premium: $50/month\n" +
                        "VIP: $80/month");


            } else if (choice == 2) {
                System.out.print("Enter membership type (basic/premium/vip): ");
                String membershipType = input.nextLine();

                System.out.print("Enter number of months: ");
                int months = input.nextInt();



                if (membershipType.equalsIgnoreCase("basic")) {
                    basicMonths = months;
                    basicTotal = 30 * basicMonths;
                    discount = months > 6 ? 0.1 * basicTotal : 0 ;
                    basicTotal -= discount;
                    System.out.println("Discount applied: $" + discount);
                    System.out.println("Final Price: $" + basicTotal);
                } else if (membershipType.equalsIgnoreCase("premium")) {
                    premiumMonths = months;
                    premiumTotal = 50 * premiumMonths;
                    discount = months > 6 ? 0.1 * premiumTotal : 0 ;
                    premiumTotal -= discount;
                    System.out.println("Discount applied: $" + discount);
                    System.out.println("Final Price: $" + premiumTotal);
                } else if (membershipType.equalsIgnoreCase("vip")) {
                    vipMonths = months;
                    vipTotal = 80 * vipMonths;
                    discount = months > 6 ? 0.1 * vipTotal : 0 ;
                    vipTotal -= discount;
                    System.out.println("Discount applied: $" + discount);
                    System.out.println("Final Price: $" + vipTotal);
                }else {
                    System.out.println("Invalid input.");
                }



            } else if (choice == 3) {
                System.out.println("=== Membership Summary ===");
                System.out.println("Basic: " + basicMonths + " months, Total = $" + basicTotal);
                System.out.println("Premium: " + premiumMonths + " months, Total = $" + premiumTotal);
                System.out.println("Vip: " + vipMonths + " months, Total = $" + vipTotal);
                System.out.println("----------------------------");
                System.out.println("Total Income = $" + (basicTotal + premiumTotal + vipTotal));
                System.out.println("Thank you for choosing FitLife Gym!");
                break;
            }else {
                System.out.println("Invalid input.");
            }
        }

    }
}
