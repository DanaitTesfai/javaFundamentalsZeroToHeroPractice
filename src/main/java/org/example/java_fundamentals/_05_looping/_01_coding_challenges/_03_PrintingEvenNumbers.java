package org.example.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _03_PrintingEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an even number: ");
        int even = scanner.nextInt();

        for (int i = 2 ; i <= even ; i+=2){
            if (i < even){
                System.out.print(i + " , ");
            }else {
                System.out.println(i);
            }

        }

        //or



        int i = 2;
        while (i<=even){
            if (i<even){
                System.out.print(i + " , ");
            }else {
                System.out.print(i);
            }
            i+=2;
        }

    }
}
