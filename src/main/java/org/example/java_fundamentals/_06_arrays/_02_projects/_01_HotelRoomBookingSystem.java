package org.example.java_fundamentals._06_arrays._02_projects;

import java.util.Scanner;

public class _01_HotelRoomBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] roomTypes = {"Standard", "Deluxe", "Suite"};
        double[] roomPrices = {40, 70, 150};

        int[] roomCount = new int[3] ;
        double[] roomIncome = new double[3] ;

        System.out.println("==============================\n" +
                "  Welcome to SunnyStay Hotel");

        while (true) {
            System.out.println("==============================\n" +
                    "1. Book a Room\n" +
                    "2. Show Summary Report\n" +
                    "3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Select Room Type:");
                for (int i = 0 ; i < roomTypes.length; i++){
                    System.out.println((i+1)+ ". " + roomTypes[i] + " ($" + roomPrices[i] + "/night)");
                }
                System.out.print("Enter your choice: ");
                int option = sc.nextInt();

                System.out.print("Enter number of rooms: ");
                int numberOfRooms = sc.nextInt();
                roomCount[option-1] += numberOfRooms;

                System.out.print("Enter number of nights: ");
                int numberOfNights = sc.nextInt();

                double total = roomPrices[option-1] *numberOfRooms *numberOfNights;

                if (option == 2 && numberOfNights >5){
                    total = total-(total*0.1);
                }

                if (option == 3 && numberOfNights >5){
                    total = total-(total*0.2);
                }
                roomIncome[option-1] += total;

                System.out.println("Booking successful! Total cost: $" + total);


            } else if (choice == 2) {
                System.out.println("Summary Report:");
                double finalTotal = 0;
                for (int i = 0 ; i <roomTypes.length; i++){
                    System.out.println(roomTypes[i] + " Rooms booked: " + roomCount[i] +" | Income: $"+ roomIncome[i]);
                    finalTotal += roomIncome[i];
                }
                System.out.println("----------------------------------------");
                System.out.println("Total Income: $"+ finalTotal);
                

            } else if (choice == 3) {
                System.out.println("Exiting... Thank you for choosing SunnyStay Hotel!");
                break;

            } else {
                System.out.println("Invalid input. Please try again.");
            }

        }
    }
}