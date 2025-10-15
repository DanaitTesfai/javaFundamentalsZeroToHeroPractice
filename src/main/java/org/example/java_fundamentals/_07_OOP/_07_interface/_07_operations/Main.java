package org.example.java_fundamentals._07_OOP._07_interface._07_operations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("1.Addition 2.Subtraction ");
        System.out.print("Choose an operation: ");
        int choice = scanner.nextInt();

        Operation operation;
        int result = 0;
        if (choice == 1) {
            operation = new AddOperation();
            result = operation.calculate(a,b);

        } else if (choice == 2) {
            operation = new SubtractOperation();
            result = operation.calculate(a,b);

        }else {
            System.out.println("Invalid input. ");
            return;
        }
        System.out.println("Result is " + result);
    }
}
