package org.example.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _04_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(x + " x " + i + " = " + (x*i));
        }

    }
}
