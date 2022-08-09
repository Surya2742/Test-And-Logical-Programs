package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[]) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
                System.out.print(i + " + ");
            }
        }
        if (sum == number) {
            System.out.println("\b\b\b = " + number);
            System.out.println(number + " is Perfect Number");
        }
        else {
            System.out.println("\b\b\b != " + number);
            System.out.println(number + " is not a Perfect Number");
        }
    }
}
