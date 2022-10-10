package com.java.corePrograms;

import java.util.Scanner;

// Java Program to Find the Largest Among Three Numbers
// ===================================================
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st no : ");
        int firstNo = sc.nextInt();
        System.out.println("Enter the 2nd no : ");
        int secondNo = sc.nextInt();
        System.out.println("Enter the 3rd no : ");
        int thirdNo = sc.nextInt();
        if ((firstNo > secondNo) && (firstNo > thirdNo))
            System.out.println("largest number = " + firstNo);
        else if ((secondNo > firstNo) && (secondNo > thirdNo))
            System.out.println("largest number = " + secondNo);
        else
            System.out.println("largest number = " + thirdNo);
    }
}

