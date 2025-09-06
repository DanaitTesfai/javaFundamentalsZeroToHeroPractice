package org.example.java_fundamentals._05_looping._01_coding_challenges;

public class _06_PrintingTo10 {
    public static void main(String[] args) {

        for (int i = 1 ; i<=10 ; i++){
            System.out.print(i + " ");
        }



        System.out.println();
        System.out.println();
        System.out.println("2. break statement");
        for(int i = 1 ; i<=10 ; i++){
            if (i==5){
                break;
            }else {
                System.out.print(i + " ");
            }
        }


        System.out.println();
        System.out.println();
        System.out.println("3.continue statement");
        for(int i = 1 ; i<=10 ; i++){
            if (i==5){
                continue;
            }else {
                System.out.print(i + " ");
            }
        }


        System.out.println();
        System.out.println();
        System.out.println("sum of first 10 numbers.");
        int sum = 0 ;
        for (int i = 1 ; i<=10 ; i++){
            if (i < 10){
                System.out.print(i + " + ");
            }else {
                System.out.print(i);
            }
            sum += i;
        }
        System.out.print(" = " + sum);




        System.out.println();
        System.out.println();
        System.out.println("print even numbers.");
        int i = 2 ;
        while (i <=20){
            System.out.print(i + " ");
            i+=2;
        }

        }
}
