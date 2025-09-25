package org.example.java_fundamentals._08_arrayLists._02_book;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Book b1 = new Book(101, "Java Basics", "John Smith");
        Book b2 = new Book(102, "Data Structures", "Alice Johnson");
        Book b3 = new Book(103, "Spring Boot Essentials", "Michael Brown");
        Book b4 = new Book(104, "Clean Code", "Robert Martin");
        Book b5 = new Book(105, "Algorithms in Java", "Thomas Cormen");

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        System.out.println("Traditional for loop.");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

        System.out.println("Enhanced for loop.");
        for (Book b : books) {
            System.out.println(b);
        }

        System.out.print("Enter a book title to search: ");
        String searchBook = scanner.nextLine();

        boolean isFound = false;
        for (Book b : books) {
            if (b.getTitle().equals(searchBook)) {
                System.out.println("Book with title " + b.getTitle() + " found: ID: " + b.getId() + ", Author: " + b.getAuthor());
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Book not found in the library.");
        }


    }
}
