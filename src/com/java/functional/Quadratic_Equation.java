package com.java.functional;
//Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
//can be found using a formula (Note: Take a, b and c as input values)
//delta = b*b - 4*a*c
//Root 1 of x = (-b + sqrt(delta))/(2*a)
//Root 2 of x = (-b - sqrt(delta))/(2*a)

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Quadratic_Equation {
    public static void main(String[] args) {
        System.out.println("enter the value of a : ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("enter the value of b : ");
        double b = sc.nextDouble();
        System.out.println("enter the value of c : ");
        double c = sc.nextDouble();
        double delta = ((b * b) - (4 * a * c));
        System.out.println("value of ((b*b)-(4*a*c))  : " + delta);
        double root1 = (-b + sqrt(delta)) / (2 * a);
        double root2 = (-b - sqrt(delta)) / (2 * a);
        System.out.println("root 1 : " + root1 + "root 2 : " + root2);

    }
}
