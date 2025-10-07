package org.example.java_fundamentals._07_OOP._06_inheritance._01_singleInheritance;

public class PersonRunner {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Alice";
        s1.age = 20;
        s1.studentId = "S001";
        s1.displayDetails();
    }
}
