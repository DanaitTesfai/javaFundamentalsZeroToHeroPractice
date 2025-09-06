package org.example.java_fundamentals._01_variables;

import java.util.Scanner;

public class _06_GroceryBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Item 1 price: ");
        double price1 = scanner.nextDouble();

        System.out.print("quantity: ");
        int quantity1 = scanner.nextInt();

        System.out.print("Item 2 price: ");
        double price2 = scanner.nextDouble();

        System.out.print("quantity: ");
        int quantity2 = scanner.nextInt();

        System.out.print("Item 3 price: ");
        double price3 = scanner.nextDouble();

        System.out.print("quantity: ");
        int quantity3 = scanner.nextInt();

        double total = price1 * quantity1 + price2 * quantity2 + price3 * quantity3 ;
        System.out.println("Total bill: " + total);

        System.out.println("Thank you for shopping with us " + name + "!");



    }
}
