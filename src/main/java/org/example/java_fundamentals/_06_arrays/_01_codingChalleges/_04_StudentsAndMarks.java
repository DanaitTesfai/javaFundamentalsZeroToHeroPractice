package org.example.java_fundamentals._06_arrays._01_codingChalleges;

public class _04_StudentsAndMarks {
    public static void main(String[] args) {
        int[][] marks = {{85,90,78}, {68,97,82}, {90,61,89}};

        for (int student = 0 ; student < marks.length ; student++){
            System.out.println("Student " + (student+1) + ":");
            for (int subject = 0 ; subject < marks[student].length ; subject++){
                System.out.print(marks[student][subject] + " ");
            }
            System.out.println();
        }
    }
}
