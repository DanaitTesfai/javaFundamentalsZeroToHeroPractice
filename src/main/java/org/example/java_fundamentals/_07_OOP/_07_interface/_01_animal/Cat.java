package org.example.java_fundamentals._07_OOP._07_interface._01_animal;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}
