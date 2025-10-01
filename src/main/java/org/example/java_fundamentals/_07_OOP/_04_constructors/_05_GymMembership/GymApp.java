package org.example.java_fundamentals._07_OOP._04_constructors._05_GymMembership;

import java.util.ArrayList;
import java.util.Scanner;

public class GymApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<GymMembership> members = new ArrayList<>();

        String username = "owner";
        String password = "gym123";

        while (true){
            System.out.println("===== Gym Owner Login =====");
            System.out.print("Enter username: ");
            String userN = scanner.nextLine();

            System.out.print("Enter password: ");
            String passW = scanner.nextLine();

            if (userN.equals(username) && passW.equals(password)){
                System.out.println("Login successful!");
                break;
            }else {
                System.out.print("Wrong username or password. Do you want to continue or exit? (1.yes / 2.no) ");
                int option = scanner.nextInt();
                scanner.nextLine();

                if (option == 1){
                    System.out.println("Ok. Try again.");
                } else if (option ==2 ) {
                    System.out.println("Ok. Exiting.");
                    return;
                }else {
                    System.out.println("Invalid input. Please try again.");
                }
            }

        }
        while (true){
            System.out.println("=== Gym Menu ===\n" +
                    "1. Register Member\n" +
                    "2. View Members\n" +
                    "3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.print("Enter Member Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Membership Type (Monthly/Annual): ");
                    String memType = scanner.nextLine();

                    System.out.print("Enter Weight: ");
                    double weight = scanner.nextDouble();

                    boolean exists = false;
                    for (GymMembership g : members){
                        if (g.getName().equalsIgnoreCase(name)){
                            System.out.println("Member already exists.");
                            exists = true;
                            break;
                        }
                    }
                    if (!exists){
                        GymMembership mem1 = new GymMembership(name, memType, weight);
                        members.add(mem1);
                        System.out.println("Member registered successfully!");
                    }

                    break;
                case 2:
                    if (members.isEmpty()){
                        System.out.println("There are no members.");
                    }else {
                        for (GymMembership g : members){
                            System.out.println(g);
                        }
                    }

                    break;
                case 3:
                    System.out.println("Exiting system... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid input.Please try again.");
                    break;
            }
        }
    }
}
