package org.example.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _10_ComparingIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        if (a > b){
            System.out.println("First number is larger.");
        }else {
            System.out.println("Second number is larger.");
        }
    }
}
