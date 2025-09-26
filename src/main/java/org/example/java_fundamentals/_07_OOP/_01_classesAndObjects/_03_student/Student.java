package org.example.java_fundamentals._07_OOP._01_classesAndObjects._03_student;

public class Student {
    String name;
    String studentId;
    int gradeLevel;
    double gpa;

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void attendClass() {
        System.out.println(name + " is attending class.");
    }

    public void takeExam() {
        System.out.println(name + " is taking an exam.");
    }

    public void displayStudentInfo() {
        System.out.println("Student Info:");
        System.out.println("Name: " + name + ", Grade level: " + gradeLevel + ", GPA " + gpa);
    }
}
