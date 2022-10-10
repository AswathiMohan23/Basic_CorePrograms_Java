package com.java.functional;
//Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
//can be found using a formula (Note: Take a, b and c as input values)
//delta = b*b - 4*a*c
//Root 1 of x = (-b + sqrt(delta))/(2*a)
//Root 2 of x = (-b - sqrt(delta))/(2*a)

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("enter the value of a : ");
        Scanner sc = new Scanner(System.in);
        double aValue = sc.nextDouble();
        System.out.println("enter the value of b : ");
        double bValue = sc.nextDouble();
        System.out.println("enter the value of c : ");
        double cValue = sc.nextDouble();
        double delta = ((bValue * bValue) - (4 * aValue * cValue));
        System.out.println("value of ((b*b)-(4*a*c))  : " + delta);
        double root1 = (-bValue + sqrt(delta)) / (2 * aValue);
        double root2 = (-bValue - sqrt(delta)) / (2 * aValue);
        System.out.println("root 1 : " + root1 + "root 2 : " + root2);
    }
}
