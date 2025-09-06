package org.example.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _11_Comparing3Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if ( a > b && a > c){
            System.out.println("First number is largest.");
        } else if (b > a && b > c) {
            System.out.println("Second number is largest.");
        } else {
            System.out.println("Third number is largest.");
        }

    }

    }

