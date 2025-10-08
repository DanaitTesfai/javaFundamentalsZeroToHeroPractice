package org.example.java_fundamentals._07_OOP._06_inheritance._03_brightFutureAcademy;

import java.util.Scanner;

public class BrightFutureAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (Validation.login(sc)){
            Menu menu = new Menu();
            menu.displayMenu(sc);
        }else {
            System.out.println("Exiting system... Goodbye!");
        }
    }
}
