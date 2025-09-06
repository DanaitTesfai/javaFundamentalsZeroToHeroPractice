package org.example.java_fundamentals._03_operators;

import java.util.Scanner;

public class _05_WarehouseStockUpdate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Initial stock: ");
        int initialStock = input.nextInt();

        System.out.print("Received: ");
        int received = input.nextInt();

        initialStock += received ;

        System.out.println("Updated stock: " + initialStock);


    }
}
