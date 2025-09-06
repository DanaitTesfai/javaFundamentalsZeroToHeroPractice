package org.example.java_fundamentals._05_looping._02_mini_projects;

import java.util.Scanner;

public class _02_RestaurantOrderingMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Welcome to Java Dine ===");
        System.out.println("Profile: Waiter Order System");

        double burgerPrice = 8 , pizzaPrice = 15 , pastaPrice = 12 ;
        double individualTotal = 0 ;
        double totalIncome = 0 ;
        int burgerCount = 0 , pizzaCount = 0 , pastaCount = 0;

        while (true) {
            System.out.println("1. View Menu");
            System.out.println("2. Place an Order");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice==1) {
                System.out.println("--- Menu ---\n" +
                        "         Burger : $8\n" +
                        "         Pizza  : $15\n" +
                        "         Pasta  : $12");
            } else if (choice==2) {
                System.out.print("Enter item (burger/pizza/pasta): ");
                String food = input.nextLine();

                System.out.print("Enter quantity: ");
                int quantity = input.nextInt();

                if (food.equalsIgnoreCase("burger")) {
                    burgerCount += quantity ;
                    individualTotal = burgerCount * burgerPrice ;
                    totalIncome += individualTotal ;

                } else if (food.equalsIgnoreCase("pizza")) {
                    pizzaCount += quantity ;
                    individualTotal = pizzaCount * pizzaPrice ;
                    totalIncome += individualTotal ;

                } else if (food.equalsIgnoreCase("pasta")) {
                    pastaCount += quantity ;
                    individualTotal = pastaCount * pastaPrice ;
                    totalIncome += individualTotal ;

                } else {
                    System.out.println("Invalid input.");
                }

                System.out.println("You ordered: " + quantity + " " + food + "/s");
                System.out.println("Total price: $" + individualTotal);

            } else if (choice == 3) {
                System.out.println("=== Order Summary ===");
                System.out.println("Burger: " + burgerCount + " x $" + burgerPrice + " = " + (burgerCount * burgerPrice));
                System.out.println("Pizza: " + pizzaCount + " x $" + pizzaPrice + " = " + (pizzaCount * pizzaPrice));
                System.out.println("Pasta: " + pastaCount + " x $" + pastaPrice + " = " + (pastaCount * pastaPrice));
                System.out.println("Total Income from Orders: $" + totalIncome);
                System.out.println("Thank you for visiting Java Dine. Goodbye!");
                break;
            }else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
