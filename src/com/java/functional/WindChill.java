package com.java.functional;
//Write a program WindChill.java that takes two double command-line arguments t
//and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
//temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
//National Weather Service defines the effective temperature (the wind chill) to be:
//
//Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
//than 120 or less than 3 (you may assume that the values you get are in that range).
// w=35.74+0.6215t+(0.4275t-35.75)v^0.16

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        System.out.println("enter the value of temperature in fahrenheit (less than 50) : ");
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        System.out.println("enter the wind speed in miles per hour (speed>120 or speed <3) : ");
        double velocity = sc.nextDouble();
        if((temperature<50)&&((velocity<120)||(velocity>3))){
            double speed=Math.pow(velocity,0.16);
            double product=  ((0.4275*temperature) - 35.75);
            double windChill =35.74+(0.6215*temperature)+(product*speed);
            System.out.println("Wind chill ,W=35.74+0.6215t+(0.4275t-35.75)v^0.16  ");
            System.out.println("result = "+windChill);
        }else
            System.out.println("temperature  should not be larger than 50 \n " +
                    "speed should be less than 120 and greater than 3");

    }
}
