package org.example.java_fundamentals._06_arrays._01_codingChalleges;

public class _02_SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};

        int sum1 = 0;
        for (int i = 0 ; i < numbers.length ; i++){
            if (i < numbers.length - 1 ){
                System.out.print(numbers[i] + " + ");
            }else {
                System.out.print(numbers[i] + " = ");
            }
            sum1 += numbers[i];
        }
        System.out.print(sum1);




        //or
        System.out.println();
        System.out.println();




        int sum2 = 0;
        String result = "";
        for (int i = 0 ; i < numbers.length ; i++){
            result += i < numbers.length - 1 ? numbers[i] + " + " : numbers[i] + " = ";
            sum2 += numbers[i];
        }
        System.out.println(result + sum2);

    }
}
