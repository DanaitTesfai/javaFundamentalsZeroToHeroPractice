package org.example.java_fundamentals._07_OOP._07_interface._03_vehicle;

public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car started");
    }
}
