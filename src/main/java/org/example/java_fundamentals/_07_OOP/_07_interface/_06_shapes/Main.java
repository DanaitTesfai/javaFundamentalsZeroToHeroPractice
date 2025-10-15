package org.example.java_fundamentals._07_OOP._07_interface._06_shapes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        Shape circle = new Circle();
        Shape rec = new Rectangle();

        shapes.add(circle);
        shapes.add(rec);

        for (Shape s: shapes){
            s.draw();
        }
    }
}
