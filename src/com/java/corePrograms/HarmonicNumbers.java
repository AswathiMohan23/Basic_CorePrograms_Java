package com.java.corePrograms;

//Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
//I/P -> The Harmonic Value N. Ensure N != 0
//Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
// O/P -> Print the Nth Harmonic Value.

import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        float sum = 0; // use long
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st no : ");
        int number=sc.nextInt();
        for (int i = 2; i <= number; i++) {
            float harmonic = (float) 1 / i;
            sum = sum + harmonic;
            System.out.println(sum);
        }
        System.out.print("\nnth Harmonic number = " + sum+"\n");
    }
}
