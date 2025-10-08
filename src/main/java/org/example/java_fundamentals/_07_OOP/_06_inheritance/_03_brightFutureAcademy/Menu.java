package org.example.java_fundamentals._07_OOP._06_inheritance._03_brightFutureAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<Student> students = new ArrayList<>();

    public void displayMenu(Scanner sc){
        while (true){
            System.out.println("=== Student Management Menu ===\n" +
                    "1. Register Student\n" +
                    "2. View All Students\n" +
                    "3. Search Student by ID\n" +
                    "4. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    registerStudent(sc);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent(sc);
                    break;
                case 4:
                    System.out.println("Exiting system... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }


    }


    public void registerStudent(Scanner sc){
        System.out.println("Select student type:");
        System.out.println("1. Undergraduate\n" +
                "2. Graduate");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        if (!Validation.isValidId(id)){
            System.out.println("Invalid id.");
            return;
        }

        if (!Validation.isValidName(name)){
            System.out.println("Invalid name.");
            return;
        }

        if (!Validation.isValidAge(age)){
            System.out.println("Invalid age.");
            return;
        }

        Student student;
        if (choice == 1){
            System.out.print("Enter Major: ");
            String major = sc.nextLine();

            if (!Validation.isNonEmpty(major)){
                System.out.println("Invalid major.");
                return;
            }
            student = new UnderGradStudent(name,age,id, major);
        } else if (choice == 2 ) {
            System.out.print("Enter Thesis Title: ");
            String thesis = sc.nextLine();

            if (!Validation.isNonEmpty(thesis)){
                System.out.println("Invalid thesis title.");
                return;
            }
            student = new GradStudent(name,age,id, thesis);
        }
        else {
            System.out.println("Invalid input.");
            return;
        }



        if (students.contains(student)){
            System.out.println("Duplicate student detected! Registration not allowed.");
        }else {
            students.add(student);
            System.out.println("Student registered successfully!");
        }
    }



    public void viewStudents(){
        System.out.println("--- Student List ---");
        if (students.isEmpty()){
            System.out.println("There are no registered students.");
        }else {
            for (Student s: students){
                s.displayInfo();
            }
        }

    }


    public void searchStudent(Scanner sc){
        System.out.print("Enter Student ID to search: ");
        String id = sc.nextLine();

        for (Student s : students){
            if (s.getStudentId().equals(id)){
                System.out.println("Student found: " );
                s.displayInfo();
                return;
            }else {
                System.out.println("Student not found.");
            }
        }

    }

}
