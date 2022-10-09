package com.java;

import java.util.Scanner;

// Java Program to Swap Two Numbers
public class Swap_Numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("First no : ");
        int firstNo = sc.nextInt();
        System.out.println("Second no : ");
        int secondNo=sc.nextInt();
        int temp=secondNo;
        secondNo=firstNo;
        firstNo=temp;
        System.out.println("After swap the result is : \nFirst no ==> "+firstNo+"\nSecond no ==> "+secondNo);



    }
}
