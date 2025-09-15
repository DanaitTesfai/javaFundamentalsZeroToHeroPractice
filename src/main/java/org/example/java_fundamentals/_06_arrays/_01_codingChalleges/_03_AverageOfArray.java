package org.example.java_fundamentals._06_arrays._01_codingChalleges;

public class _03_AverageOfArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};

        int sum = 0;
        String result = "";
        for (int i = 0 ; i < array.length ; i++){
            result += i < array.length - 1 ? array[i] + " + " : array[i] ;
            sum += array[i];
        }
        System.out.println(result + " / " + array.length + " = " + (sum/array.length));
    }
}
