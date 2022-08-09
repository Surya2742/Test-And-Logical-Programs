package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class CouponNumbers {
    public static int Coupon(int number) {
        return (int) (Math.random() * number);
    }

    public static void TotalRandomNumber(int number) {

        int[] collect = new int[number];
        int count = 0;
        int notSame = 1;
        while (notSame < number) {
            int card = Coupon(number);
            count++;
            if (collect[card] != card) {
                notSame++;
                collect[card] = card;
            }
        }
        System.out.println("Total Random Numbers needed: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Enter a card Number to Draw: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        TotalRandomNumber(number);
    }
}
