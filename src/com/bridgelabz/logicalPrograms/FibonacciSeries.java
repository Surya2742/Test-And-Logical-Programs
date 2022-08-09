package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]) {
        int firstTerm = 0;
        int secondTerm = 1;
        int finalTerm = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth value: ");
        int number = scanner.nextInt();
        System.out.println("Fibonacci series: ");
        System.out.print(firstTerm + " ");
        System.out.print(secondTerm + " ");
        for (int i = 2; i < number; i++) {
            finalTerm = firstTerm + secondTerm;
            System.out.print(finalTerm + " ");
            firstTerm = secondTerm;
            secondTerm = finalTerm;
        }
    }
}
