package org.example.java_fundamentals._05_looping._01_coding_challenges;

import javax.xml.transform.Source;
import java.util.Scanner;

public class _02_ComputeSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int sum = 0 ;
        for (int i = 1 ; i <= n ; i++){
            if (i < n){
                System.out.print(i + " + ");
            }else {
                System.out.print(i);
            }
            sum += i;
        }
        System.out.print(" = " + sum);

    }
}
