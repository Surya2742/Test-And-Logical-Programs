package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class ReverseNumber {

    public static void reverse(int number) {
        int reverse = 0;
        while(number != 0) {
            int remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }
        System.out.println("The reverse Number of entered Value is : " + reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int inputNumber = sc.nextInt();
        reverse(inputNumber);
    }
}
