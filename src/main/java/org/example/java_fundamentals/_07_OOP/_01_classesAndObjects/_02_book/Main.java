package org.example.java_fundamentals._07_OOP._01_classesAndObjects._02_book;

public class Main {
    public static void main(String[] args) {
        Book javaBook = new Book();

        javaBook.title = "Java Programming";
        javaBook.author = "John Doe";
        javaBook.price = 45.5;
        javaBook.available = true;

        javaBook.borrowBook();
        javaBook.returnBook();
        javaBook.displayBookInfo();
    }
}
