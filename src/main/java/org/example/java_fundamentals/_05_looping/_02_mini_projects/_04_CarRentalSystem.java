package org.example.java_fundamentals._05_looping._02_mini_projects;

import java.util.Scanner;

public class _04_CarRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSedan = 0 , totalSuv = 0 , totalLuxury = 0 ;
        int sedanCount = 0 , suvCount = 0 , luxuryCount = 0 ;
        double discount = 0 ;

        while (true) {
            System.out.println("=== Welcome to EasyCar Rentals ===\n" +
                    "1. View Available Cars\n" +
                    "2. Rent a Car\n" +
                    "3. Exit and Show Summary");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Sedan → $50 per day\n" +
                        "\n" +
                        "SUV → $80 per day\n" +
                        "\n" +
                        "Luxury Car → $120 per day");

            } else if (choice ==2) {
                System.out.print("Enter car type (sedan/suv/luxury): ");
                String carType = scanner.nextLine();

                System.out.print("Enter number of cars: ");
                int numberOfCars = scanner.nextInt();

                System.out.print("Enter rental days: ");
                int rentalDays = scanner.nextInt();




                if (carType.equalsIgnoreCase("sedan")) {
                    sedanCount = numberOfCars ;
                    totalSedan = 50 * rentalDays * sedanCount ;
                    discount = 0;
                    totalSedan -= discount;
                    System.out.println("Total Rental Cost: $" + totalSedan);
                } else if (carType.equalsIgnoreCase("suv")) {
                    suvCount = numberOfCars ;
                    totalSuv = 80 * rentalDays * suvCount ;
                    discount = rentalDays > 7 ? 0.1 * totalSuv : 0 ;
                    totalSuv -= discount;
                    System.out.println("Total Rental Cost: $" + totalSuv);

                } else if (carType.equalsIgnoreCase("luxury")) {
                    luxuryCount = numberOfCars ;
                    totalLuxury = 120 * rentalDays * luxuryCount ;
                    discount = rentalDays > 7 ? 0.15 * totalLuxury : 0 ;
                    totalLuxury -= discount;
                    System.out.println("Total Rental Cost: $" + totalLuxury);

                }else {
                    System.out.println("Invalid input");
                }



            } else if (choice == 3) {
                System.out.println("=== Rental Summary ===");
                System.out.println("Sedans rented: " + sedanCount + ", Income: $" + totalSedan);
                System.out.println("SUVs rented: " + suvCount + ", Income: $" + totalSuv);
                System.out.println("Luxury cars rented: " + luxuryCount + ", Income: $" + totalLuxury);
                System.out.println("Total Income = $" + (totalSedan + totalSuv + totalLuxury));
                break;
            } else {
                System.out.println("Invalid input.");
            }


        }

    }
}
