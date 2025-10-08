package org.example.java_fundamentals._07_OOP._06_inheritance._03_brightFutureAcademy;

import java.util.Objects;

public class Student extends Person{
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void displayInfo(){
        System.out.println("ID: " + studentId + " | Name: " + getName() + " | Age: " + getAge());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentId);
    }
}
