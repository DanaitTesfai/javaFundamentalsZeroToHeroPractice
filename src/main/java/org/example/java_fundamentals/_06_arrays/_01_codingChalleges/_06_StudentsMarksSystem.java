package org.example.java_fundamentals._06_arrays._01_codingChalleges;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class _06_StudentsMarksSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter number of students: ");
        int numberOfStudents =sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int numberOfSubjects =sc.nextInt();
        sc.nextLine();

        String[] names = new String[numberOfStudents];
        int[][] marks = new int[numberOfStudents][numberOfSubjects];
        int[] total = new int[numberOfStudents];

        for (int i = 0; i <numberOfStudents; i++){
            System.out.print("Enter name for Student " + (i+1) + ": ");
            names[i] = sc.nextLine();
            System.out.println("Enter marks for " + names[i] + ":");
            for (int j = 0; j < numberOfSubjects; j++){
                System.out.print("Subject " + (j+1)+ ": ");
                marks[i][j] = sc.nextInt();
                total[i] += marks[i][j];
            }
            sc.nextLine();
        }
        System.out.println();
        System.out.println();



        //Header
        System.out.println("Student Marks Report:");
        System.out.print("Name" + "\t");
        for (int i = 0; i < numberOfSubjects; i++){
            System.out.print("Sub" + (i+1) + "\t");
        }
        System.out.println("Total\tAverage");


        //Content
        double highestScore = -1;
        String topper = "";
        for (int i = 0; i < numberOfStudents; i++){
            double average = total[i]/numberOfSubjects;
            System.out.print(names[i] + "\t");
            for (int j = 0 ; j < numberOfSubjects; j++){
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println(total[i] + "\t" + average);
            if (average > highestScore){
                highestScore = average;
                topper = names[i];
            }
        }
        System.out.println();

        System.out.println("Topper: " + topper + " with average = " + highestScore);
    }
}
