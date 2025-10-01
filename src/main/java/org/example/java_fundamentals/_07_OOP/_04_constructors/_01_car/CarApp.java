package org.example.java_fundamentals._07_OOP._04_constructors._01_car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Car c1 = new Car("Toyota", "Camry", 2020);
        Car c2 = new Car("BMW", "Series", 2021);

        cars.add(c1);
        cars.add(c2);

        for (Car c : cars){
            System.out.println(c);
        }

        System.out.print("Enter car brand to search: ");
        String searchCar = scanner.nextLine();

        boolean isFound = false;
        for (Car c : cars){
            if (c.getBrand().equals(searchCar)){
                System.out.println(c);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Car not found.");
        }

    }
}
