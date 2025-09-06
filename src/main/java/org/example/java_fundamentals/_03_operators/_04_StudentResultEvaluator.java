package org.example.java_fundamentals._03_operators;

import java.util.Scanner;

public class _04_StudentResultEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Maths: ");
        double maths = scanner.nextDouble();

        System.out.print("Science: ");
        double science = scanner.nextDouble();

        String result = maths >= 50 && science >= 50 ? "Pass" : "Fail" ;

        System.out.println("Result: " + result);

    }
}
