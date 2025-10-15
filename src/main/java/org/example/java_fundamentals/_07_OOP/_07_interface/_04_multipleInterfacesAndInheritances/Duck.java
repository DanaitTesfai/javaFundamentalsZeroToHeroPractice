package org.example.java_fundamentals._07_OOP._07_interface._04_multipleInterfacesAndInheritances;

public class Duck implements Flyable, Swimmable{

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }
}
