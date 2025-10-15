package org.example.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._03_brightFutureAcademy;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <=120){
            this.age = age;
        }else {
            System.out.println("Invalid age. Age must be great than 0 and less than or equal 120.");
        }
    }


}
