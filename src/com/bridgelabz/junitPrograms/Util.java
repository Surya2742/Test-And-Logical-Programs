package com.bridgelabz.junitPrograms;

import java.util.Scanner;

public class Util {

    public static void dayOfWeek() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day between (1-31) : ");
        int d = sc.nextInt();
        System.out.print("Enter Month between (1-12) : ");
        int m = sc.nextInt();
        System.out.print("Enter Year in format (YYYY) : ");
        int y = sc.nextInt();

        int Y=((y-(14-m)/12));
        int X=((Y+(Y/4)-(Y/100)+(Y/400)));
        int M=((m+12*((14-m)/12)-2));
        int D=(((d+X+(31*M)/12)%7));

        switch (D) {
            case 0:
                System.out.println("The Date entered is Sunday");
                break;
            case 1:
                System.out.println("The Date entered is Monday");
                break;
            case 2:
                System.out.println("The Date entered is Tuesday");
                break;
            case 3:
                System.out.println("The Date entered is Wednesday");
                break;
            case 4:
                System.out.println("The Date entered is Thursday");
                break;
            case 5:
                System.out.println("The Date entered is Friday");
                break;
            case 6:
                System.out.println("The Date entered is Saturday");
                break;
            default:
                System.out.println("Re-verify the Date.");
                break;
        }
    }

    public static void main(String[] args) {
        dayOfWeek();
    }


}
