package com.bridgelabz.junitPrograms;

import java.util.Scanner;

public class Binary {

    public static void intToBinary(int number) {
        String binaryString = String.format("%8s", Integer.toBinaryString(number)).replaceAll(" ", "0");
        System.out.println("Integer Number in 8-bit binary : " + binaryString);
        swap(binaryString);
    }

    public static void swap(String binaryOne) {
        String nibOne = binaryOne.substring(binaryOne.length() - 4);
        String nibTwo = binaryOne.substring(0, 4);
        String swap = nibOne.concat(nibTwo);
        System.out.println("Binary 8 bit after nibble Swap : " + swap);
        binaryToInt(swap);
    }

    public static void binaryToInt(String binaryTwo) {
        int binaryToInt=Integer.parseInt(binaryTwo,2);
        System.out.println("Integer Number after nibble swap is : " + binaryToInt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer value in range (0 - 255) to convert it to Binary : ");
        int input = sc.nextInt();
        if (input >=0 && input <= 255) {
            intToBinary(input);
        }
        else {
            System.out.println("The Integer Value entered is incorrect/ not in range");
        }
        sc.close();
    }

}