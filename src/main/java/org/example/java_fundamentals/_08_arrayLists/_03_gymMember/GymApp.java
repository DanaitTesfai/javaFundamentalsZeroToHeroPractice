package org.example.java_fundamentals._08_arrayLists._03_gymMember;

import java.util.ArrayList;
import java.util.Scanner;

public class GymApp {
    public static void main(String[] args) {
        ArrayList<GymMember> gymMembers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("=== Gym Membership Menu ===\n" +
                    "  1. Add Member\n" +
                    "  2. View Members\n" +
                    "  3. Update Member Name\n" +
                    "  4. Delete Member\n" +
                    "  5. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            if (option ==1){
                System.out.println("Add member");

            } else if (option ==2) {
                System.out.println("View members");

            } else if (option ==3) {
                System.out.println("Update member");

            } else if (option ==4) {
                System.out.println("Delete member");

            } else if (option ==5) {
                System.out.println("exit");
                break;

            }else {
                System.out.println("Invalid input. Please try again.");
            }

        }
    }
}
