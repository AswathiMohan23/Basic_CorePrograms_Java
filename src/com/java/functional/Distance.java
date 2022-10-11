package com.java.functional;
//Write a program Distance.java that takes two integer command-line arguments x
//and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
//formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        System.out.println("enter the value of X co-ordinate : ");
        Scanner sc = new Scanner(System.in);
        int xCoordinate = sc.nextInt();
        System.out.println("enter the value of Y co-ordinate : ");
        int yCoordinate = sc.nextInt();
        int powerOfX= (int) Math.pow(xCoordinate,2);
        int powerOfY=(int) Math.pow(yCoordinate,2);
        double distance =Math.sqrt(powerOfX+powerOfY);
        System.out.println("Euclidean distance  : "+distance);
    }
}
