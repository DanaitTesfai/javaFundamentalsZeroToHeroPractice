package org.example.java_fundamentals._03_operators;

import java.util.Scanner;

public class _02_HotelRoomBooking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nightlyRate = 120 ;

        System.out.print("Enter number of nights: ");
        int nights = input.nextInt() ;

        double totalBeforeDiscount = nightlyRate * nights ;

        double discount = nights > 3 ? 0.15 * totalBeforeDiscount : 0 ;

        double finalTotal = totalBeforeDiscount - discount ;

        System.out.println("Total before discount: $" + totalBeforeDiscount);
        System.out.println("Discount: " + (discount > 0 ? "15%" : "0%"));
        System.out.println("Total after discount: $" + finalTotal);

    }
}
