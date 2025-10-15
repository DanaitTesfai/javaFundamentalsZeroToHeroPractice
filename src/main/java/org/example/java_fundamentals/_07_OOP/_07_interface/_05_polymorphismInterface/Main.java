package org.example.java_fundamentals._07_OOP._07_interface._05_polymorphismInterface;

public class Main {
    public static void main(String[] args) {
        Playable football = new Football();
        football.play();

        Playable piano = new Piano();
        piano.play();
    }
}
