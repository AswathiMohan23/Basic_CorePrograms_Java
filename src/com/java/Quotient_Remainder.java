package com.java;

//Java Program to Compute Quotient and Remainder

import java.util.Scanner;

public class Quotient_Remainder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dividend : ");
        int dividend = sc.nextInt();
        System.out.println("enter the divisor : ");
        int divisor = sc.nextInt();
        float quotient=(float)dividend/divisor;
        int remainder = dividend%divisor;
        System.out.println("enter the remainder = "+remainder);
        System.out.println("enter the quotient = "+quotient);



    }
}