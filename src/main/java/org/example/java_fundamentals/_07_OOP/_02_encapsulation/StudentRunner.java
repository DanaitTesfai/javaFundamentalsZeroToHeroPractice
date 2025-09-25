package org.example.java_fundamentals._07_OOP._02_encapsulation;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();
        student.setName(name);

        System.out.print("Enter student age: ");
        int age = input.nextInt();
        student.setAge(age);

        student.studentProfile();
    }
}
