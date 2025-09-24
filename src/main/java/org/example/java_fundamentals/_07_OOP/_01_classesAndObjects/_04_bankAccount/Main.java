package org.example.java_fundamentals._07_OOP._01_classesAndObjects._04_bankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.accountName = "John Smith";
        bankAccount.accountNumber = "AC12345";
        bankAccount.balance = 0;

        bankAccount.deposit(500);
        bankAccount.withdraw(200);
        bankAccount.checkBalance();
        bankAccount.displayAccountInfo();
    }
}
