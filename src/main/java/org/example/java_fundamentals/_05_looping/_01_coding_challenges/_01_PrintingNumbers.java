package org.example.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _01_PrintingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt() ;

        for (int i = 1 ; i <= n ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
