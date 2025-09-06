package org.example.java_fundamentals._01_variables;

import java.util.Scanner;

public class _05_HotelBookingCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Guest name: ");
        String name = input.nextLine();

        System.out.print("Number of nights: ");
        int numberOfNights = input.nextInt();

        System.out.print("Price per night: ");
        double nightlyPrice = input.nextDouble();

        System.out.print("Breakfast cost per night: ");
        double breakfastPrice = input.nextDouble();

        double totalRoomPrice = numberOfNights * nightlyPrice ;
        double totalBreakfastPrice = numberOfNights * breakfastPrice ;

        System.out.println("Total room cost: " + totalRoomPrice);
        System.out.println("Total breakfast cost: " + totalBreakfastPrice);
        System.out.println("Grand total: " + (totalRoomPrice + totalBreakfastPrice));

    }
}
