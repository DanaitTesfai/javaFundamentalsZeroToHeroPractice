package org.example.java_fundamentals._07_OOP._07_interface._08_paymentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1.Pay 2.Exit");
            System.out.print("Would you like to pay or exit? ");
            int option = sc.nextInt();

            if (option == 1){
                System.out.print("Enter amount to pay: ");
                double amount = sc.nextDouble();

                if (amount <= 0){
                    System.out.println("❌ Invalid amount. Please enter a positive amount");
                    continue;
                }

                System.out.println("Select Payment Method:");
                System.out.println("1\uFE0F⃣ UPI\n" +
                        "2\uFE0F⃣ Debit/Credit Card\n" +
                        "3\uFE0F⃣ Mobile Wallet\n" +
                        "4\uFE0F⃣ Net Banking");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                Payment payment;
                if (choice == 1){
                    payment = new UpiPayment();
                    payment.pay(amount);
                } else if (choice == 2) {
                    payment = new CardPayment();
                    payment.pay(amount);
                }else if (choice == 3) {
                    payment = new MobileWallet();
                    payment.pay(amount);
                }else if (choice == 4) {
                    payment = new NetBanking();
                    payment.pay(amount);
                }else {
                    System.out.println("Invalid input.");
                }
            } else if (option == 2) {
                System.out.println("Exiting...");
                return;
            }else {
                System.out.println("❌ Invalid input. Please try again.");
            }
        }

    }
}
