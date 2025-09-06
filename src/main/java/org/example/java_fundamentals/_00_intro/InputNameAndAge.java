package org.example.java_fundamentals._00_intro;

import java.util.Scanner;

public class InputNameAndAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ". You are " + age + " years old.");
    }
}
