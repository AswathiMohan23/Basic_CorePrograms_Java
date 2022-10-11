package com.java.corePrograms;

// Java Program to Check Whether a Number is Even or Odd
// =====================================================

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        checkWhetherEvenOrOdd(number);
    }

    public static void checkWhetherEvenOrOdd(int number) {
        if ((number % 2) == 0)
            System.out.println("the entered no is ==> even");
        else
            System.out.println("the entered no is ==> odd");
    }
}
