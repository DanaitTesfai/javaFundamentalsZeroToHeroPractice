package org.example.java_fundamentals._03_operators;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 5 ;
        int b = 10 ;

        int additionResult = a + b ;
        System.out.println(additionResult);
        System.out.println(b % a);
        System.out.println(b / a);


        System.out.println(a > b);
        System.out.println(a==5);
        System.out.println(b != 5);

        int x = 5 , y = 13 ;
        int result = x++ + --y ;
        System.out.println(x); //x = 6
        System.out.println(y); // y =12
        System.out.println(result); //result = 17

        int result2 = ++x + y++ + --y ;
        System.out.println(x); // x = 7
        System.out.println(y); // y = 12
        System.out.println(result2); // result2 = 31


    }
}
