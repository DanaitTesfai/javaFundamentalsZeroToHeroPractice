package org.example.java_fundamentals._07_OOP._01_classesAndObjects._04_bankAccount;

public class BankAccount {
    String accountName;
    String accountNumber;
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " successfully.");
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Withdrawal fail. Insufficient amount");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successfully.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public void displayAccountInfo() {
        System.out.println("Account Info:");
        System.out.println("Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

}
