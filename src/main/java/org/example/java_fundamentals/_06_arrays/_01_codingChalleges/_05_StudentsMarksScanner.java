package org.example.java_fundamentals._06_arrays._01_codingChalleges;

import java.util.Scanner;

public class _05_StudentsMarksScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[2][3];

        //input
        for (int i = 0 ; i <marks.length ; i++){
            System.out.println("Enter marks for Student " + (i+1) + ":");
            for (int j = 0 ; j < marks[i].length ; j++){
                System.out.print("Subject " + (j+1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println();


        //output
        System.out.println("Student Marks Table:");
        for (int i = 0 ; i <marks.length ; i++){
            System.out.print("Student " + (i+1) + " : ");
            for (int j = 0 ; j < marks[i].length ; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
