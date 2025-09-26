package org.example.java_fundamentals._07_OOP._01_classesAndObjects._03_student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Alice";
        student.studentId = "ST123";
        student.gradeLevel = 2;
        student.gpa = 3.5;


        student.study();
        student.attendClass();
        student.takeExam();
        student.displayStudentInfo();

    }
}
