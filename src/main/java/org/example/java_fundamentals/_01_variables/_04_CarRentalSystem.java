package org.example.java_fundamentals._01_variables;

import java.util.Scanner;

public class _04_CarRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car model: ");
        String carModel = scanner.nextLine();

        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();

        System.out.print("Enter daily price: ");
        double dailyPrice = scanner.nextDouble();

        double total = days * dailyPrice ;
        System.out.println("Total cost: " + total);


    }
}
