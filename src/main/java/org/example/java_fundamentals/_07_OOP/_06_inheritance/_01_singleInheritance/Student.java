package org.example.java_fundamentals._07_OOP._06_inheritance._01_singleInheritance;

public class Student extends Person{
    String studentId;

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student Id: " + studentId);
    }
}
