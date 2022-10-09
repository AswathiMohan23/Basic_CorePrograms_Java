package com.java;

import java.util.Scanner;
//The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.
// So ensure to check for the same. Further, the Leap Year is
// a Year divisible by 4 and not 100 unless it is divisible by 400.
// For e.g. 1800 is not a Leap Year and 2000 is a Leap Year.

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year : ");
        int year = sc.nextInt();
        if (year >= 1582) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
                System.out.println("Leap year");
            else
                System.out.println("Not Leap year : ");
        }
    }
}
