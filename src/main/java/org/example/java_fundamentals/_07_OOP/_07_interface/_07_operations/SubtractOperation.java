package org.example.java_fundamentals._07_OOP._07_interface._07_operations;

public class SubtractOperation implements Operation{

    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
