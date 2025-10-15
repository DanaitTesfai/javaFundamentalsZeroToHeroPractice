package org.example.java_fundamentals._07_OOP._06_inheritanceAndPolymorphism._02_multilevelInheritance;

public class Dog extends Mammal{
    public void bark(){
        System.out.println("Dogs can bark.");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("Dogs eat dog food.");
    }
}
