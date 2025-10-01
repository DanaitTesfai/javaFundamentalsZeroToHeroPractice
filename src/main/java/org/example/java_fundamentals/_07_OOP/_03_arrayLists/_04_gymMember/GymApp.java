package org.example.java_fundamentals._07_OOP._03_arrayLists._04_gymMember;

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
                System.out.print("Enter member ID: ");
                int memId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter member name: ");
                String name = sc.nextLine();

                System.out.print("Enter membership type (Monthly/Yearly): ");
                String memType = sc.nextLine();

                boolean exist = false;
                for (GymMember g : gymMembers){
                    if (g.getId()== memId){
                        System.out.println("Error: Member with this ID already exists.");
                        exist = true;
                        break;
                    }

                }
                if (!exist){
                    GymMember mem1 = new GymMember(memId, name, memType);
                    gymMembers.add(mem1);
                    System.out.println("Member added successfully!");
                }


            } else if (option ==2) {
                if (gymMembers.isEmpty()){
                    System.out.println("There are no members.");
                }
                else {
                    for (GymMember g: gymMembers){
                        System.out.println(g);
                    }
                }


            } else if (option ==3) {
                System.out.print("Enter member ID to update: ");
                int updateId = sc.nextInt();
                sc.nextLine();

                boolean isFound = false;
                for (GymMember g: gymMembers){
                    if (g.getId()==updateId){
                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        g.setName(newName);
                        isFound = true;
                        break;
                    }
                }
                if (isFound){
                    System.out.println("Member name updated successfully!");
                }else {
                    System.out.println("Member with ID " + updateId +" not found.");
                }


            } else if (option ==4) {
                System.out.print("Enter member ID to delete: ");
                int delId = sc.nextInt();

                boolean isFound = false;
                for (GymMember g: gymMembers){
                    if (g.getId()==delId){
                        gymMembers.remove(g);
                        isFound = true;
                        System.out.println("Member deleted successfully!");
                        break;
                    }
                }
                if (!isFound){
                    System.out.println("Member with ID " + delId + " not found.");
                }



            } else if (option ==5) {
                System.out.println("Goodbye! Stay fit!");
                break;

            }else {
                System.out.println("Invalid input. Please try again.");
            }

        }
    }
}
