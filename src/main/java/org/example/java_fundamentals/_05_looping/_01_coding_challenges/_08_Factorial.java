package org.example.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _08_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int result = 1;
        for (int i = n ; i >= 1 ; i--){
            if (i>1){
                System.out.print(i + " * ");
            }else {
                System.out.print(i);
            }
            result *= i;
        }
        System.out.print(" = " + result);


    }

}
