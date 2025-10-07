package org.example.java_fundamentals._07_OOP._05_objectEquality._05_brightFutureAcademy;

import java.util.Scanner;

public class BrightFutureAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isLogin = Validation.login(scanner);
        if (isLogin){
            Menu menu = new Menu();
            menu.displayMenu(scanner);
        }else {
            System.out.println("There is an error logging in. You can not proceed.");
        }
    }
}
