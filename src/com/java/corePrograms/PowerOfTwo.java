package com.java.corePrograms;
// Desc -> This program takes a command-line argument N and prints a table of the powers of 2
// that are less than or equal to 2^N. I/P -> The Power Value N. Only works if 0 <= N < 31
// since 2^31 overflows an int Logic -> repeat until i equals N.

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("enter the number : ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if((number>=0)&&(number<31)){
            System.out.println("2^n = "+(int) Math.pow(2,number)+ "\nTable of power of 2 which is " +
                    "less than or equal to "+(int) Math.pow(2,number)+" : ");
            for(int i=0;i<=(int) Math.pow(2,number);i++){
                System.out.println("2^"+i+" : " +(int) Math.pow(2,i));
           }
        }
    }
}
