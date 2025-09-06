package org.example.java_fundamentals._01_variables;

import java.util.Scanner;

public class _02_SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest (%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time in years: ");
        int years = scanner.nextInt();

        double interest = (principal * rate * years) / 100 ;
        System.out.println("Simple Interest: " + interest);
    }
}
