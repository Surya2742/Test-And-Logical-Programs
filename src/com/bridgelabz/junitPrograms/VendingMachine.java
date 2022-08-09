package com.bridgelabz.junitPrograms;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rupees to return in change : ");
        int changeToReturn = sc.nextInt();
        while (changeToReturn != 0) {
            int notesOf1000 = changeToReturn / 1000;
            System.out.println("Rs. 1000 note : " + notesOf1000);
            changeToReturn = changeToReturn % 1000;

            int notesOf500 = changeToReturn / 500;
            System.out.println("Rs. 500 note : " + notesOf500);
            changeToReturn = changeToReturn % 500;

            int notesOf100 = changeToReturn / 100;
            System.out.println("Rs. 100 note : " + notesOf100);
            changeToReturn = changeToReturn % 100;

            int notesOf50 = changeToReturn / 50;
            System.out.println("Rs. 50 note : " + notesOf50);
            changeToReturn = changeToReturn % 50;

            int notesOf10 = changeToReturn / 10;
            System.out.println("Rs. 10 note : " + notesOf10);
            changeToReturn = changeToReturn % 10;

            int notesOf5 = changeToReturn / 5;
            System.out.println("Rs. 5 note : " + notesOf5);
            changeToReturn = changeToReturn % 5;

            int notesOf2 = changeToReturn / 2;
            System.out.println("Rs. 2 note : " + notesOf2);
            changeToReturn = changeToReturn % 2;

            int notesOf1 = changeToReturn / 1;
            System.out.println("Rs. 1 note : " + notesOf1);
            changeToReturn = changeToReturn % 1;

            int numberOfNotes = notesOf1000 + notesOf500 + notesOf100 + notesOf50 + notesOf10 + notesOf5 + notesOf2 + notesOf1 ;
            System.out.println("The Minimum number of Notes required for change is : " + numberOfNotes);

        }
    }
}
