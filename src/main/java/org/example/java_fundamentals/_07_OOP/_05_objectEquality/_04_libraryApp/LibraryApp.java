package org.example.java_fundamentals._07_OOP._05_objectEquality._04_libraryApp;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("==== Librarian Login ======");

        String username = "librarian";
        String password = "lib123";

        while (true) {
            System.out.print("Enter username: ");
            String userN = input.nextLine();

            System.out.print("Enter password: ");
            String passW = input.nextLine();

            if (userN.equals(username) && passW.equals(password)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.print("Wrong username or password.\n" +
                        "Would you like to continue or exit.(1.yes / 2.no) ");
                int option = input.nextInt();
                input.nextLine();

                if (option == 1) {
                    System.out.println("Ok.Try again.");
                } else if (option == 2) {
                    System.out.println("Ok.Exiting.");
                    return;
                } else {
                    System.out.println("Invalid input.Please try again.");
                }
            }
        }

        while (true) {
            System.out.println("=== Library Menu ===\n" +
                    " 1. Add Book\n" +
                    " 2. View Books\n" +
                    " 3. Search Book by Title\n" +
                    " 4. Exit");
            System.out.print("Choose an option: ");
            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookId = input.nextLine();

                    System.out.print("Enter Title: ");
                    String title = input.nextLine();

                    System.out.print("Enter author: ");
                    String author = input.nextLine();

                    boolean exits = false;
                    for (Book b : books) {
                        if (b.getBookId().equals(bookId)) {
                            System.out.println("Duplicate book! Cannot add.");
                            exits = true;
                        }
                    }
                    if (!exits) {
                        Book b1 = new Book(bookId, title, author);
                        books.add(b1);
                        System.out.println("Book added successfully!");
                        break;
                    }
                    break;


                case 2:
                    if (books.isEmpty()) {
                        System.out.println("There are no books.");
                    } else {
                        for (Book b : books) {
                            System.out.println(b);
                        }
                    }
                    break;


                case 3:
                    System.out.print("Enter title to search: ");
                    String searchTitle = input.nextLine();

                    boolean isFound = false;
                    for (Book b : books) {
                        if (b.getTitle().equals(searchTitle)) {
                            System.out.println("Book found: " + b);
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound) {
                        System.out.println("Book not found.");
                    }
                    break;


                case 4:
                    System.out.println("Exiting system... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid input.Please try again.");
                    break;
            }


        }

    }
}
