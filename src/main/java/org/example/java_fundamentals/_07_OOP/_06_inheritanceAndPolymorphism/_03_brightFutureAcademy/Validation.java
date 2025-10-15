package org.example.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._03_brightFutureAcademy;

import java.util.Scanner;

public class Validation {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static boolean login(Scanner scanner){
        System.out.println("===== School Admin Login =====");
        System.out.print("Enter username: ");
        String userN = scanner.nextLine();

        System.out.print("Enter password: ");
        String passW = scanner.nextLine();

        if (userN.equals(USERNAME) && passW.equals(PASSWORD)){
            System.out.println("Login successful!");
            return true;
        }else {
            System.out.println("Incorrect username or password.");
            return false;
        }
    }

    public static boolean isValidId(String id){
        return id != null && id.matches("[A-Za-z0-9]+");
    }

    public static boolean isValidName(String name){
        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidAge(int age){
        return age > 0 && age <= 120;
    }

    public static boolean isNonEmpty(String text){
        return text != null && !text.trim().isEmpty();
    }




}
