package org.example.java_fundamentals._02_typecasting;

import java.util.Scanner;

public class _03_GymMembership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Gym Membership Fee Calculator ===");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter monthly fee (in decimals): ");
        double monthlyFee = scanner.nextDouble();

        System.out.print("Enter number of months: ");
        int months = scanner.nextInt();

        double total1 = monthlyFee * months ;
        int total2 = (int) total1 ;

        System.out.println("--- Membership Summary ---");
        System.out.println("Member: " + name);
        System.out.println("Exact total: $" + total1);
        System.out.println("Rounded total for invoice: $" + total2);

    }
}
