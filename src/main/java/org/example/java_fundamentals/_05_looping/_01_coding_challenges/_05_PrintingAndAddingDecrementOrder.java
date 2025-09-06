package org.example.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _05_PrintingAndAddingDecrementOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();

        int i = n;
        int sum = 0;

        while (i>=1){
            if (i>1){
                System.out.print(i + " + ");
            }else {
                System.out.print(i);
            }
            sum += i;
            i--;
        }
        System.out.print(" = " + sum);
    }
}
