package org.example.java_fundamentals._07_OOP._05_objectEquality._05_brightFutureAcademy;

import javax.swing.plaf.SplitPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<Student> students = new ArrayList<>();

    public void displayMenu(Scanner sc){
        boolean running = true;
        while (running){
            System.out.println("=== Student Management Menu ===\n" +
                    "1. Register Student\n" +
                    "2. View All Students\n" +
                    "3. Search Student by ID\n" +
                    "4. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    registerStudents(sc);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent(sc);
                    break;
                case 4:
                    System.out.println("Exiting system... Goodbye!");
                    running = false;
                    break;
                case 5:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }



    public void registerStudents(Scanner sc){
        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();

        System.out.print("Enter Student name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student age: ");
        int age = sc.nextInt();

        if (!Validation.isValidId(studentId)){
            System.out.println("Invalid Id number.");
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

        Student student = new Student(studentId, name, age);

        if (students.contains(student)){
            System.out.println("Duplicate student detected! Registration not allowed.");
        }else {
            students.add(student);
            System.out.println("Student registered successfully!");
        }
    }

    public void viewStudents(){
        if (students.isEmpty()){
            System.out.println("There are no registered students yet.");
        }else {
            for (Student s: students){
                s.displayInfo();
            }
        }
    }

    public void searchStudent(Scanner sc){
        System.out.print("Enter Student ID to search: ");
        String id = sc.nextLine();

        for (Student s: students){
            if (s.getStudentId().equals(id)){
                System.out.println("Student found:" + s);
                return;
            }
        }
        System.out.println("Student not found.");

    }
}
