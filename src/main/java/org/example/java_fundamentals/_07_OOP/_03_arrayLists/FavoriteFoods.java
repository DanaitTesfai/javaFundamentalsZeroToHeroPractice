package org.example.java_fundamentals._07_OOP._03_arrayLists;

import java.util.ArrayList;

public class FavoriteFoods {
    public static void main(String[] args) {
        ArrayList<String > foods = new ArrayList<>();

        foods.add("pizza");
        foods.add("pasta");
        foods.add("burger");

        for (String food : foods){
            System.out.println(food);
        }

        boolean isRemoved = foods.remove("burger");
        if (isRemoved){
            System.out.println("Item removed successfully.");
        }else {
            System.out.println("Item cant be found.");
        }
        System.out.println(foods);


    }

}
