package com.java.corePrograms;
//Flip Coin and print percentage of Heads and Tails
// I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
//Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
// O/P -> Percentage of Head vs Tails

import java.util.Scanner;

public class FlipCoin {
    static double randomCheck = 0;
    static int head = 0, tail = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many times do want to flip the coin : ");
        int times = sc.nextInt();
        int limit = times;
        checkTheOccurrence(times,limit);
    }
    public static void checkTheOccurrence(int times, int limit) {
        if(times==(int) times) {
            for (int i = 0; i < times; i++) {
                randomCheck = (int) (Math.random() * (1 - 0 + 1) + 0);
                if (randomCheck < 0.5) {
                    System.out.println("HEAD");
                    head++;
                } else {
                    System.out.println("TAIL");
                    tail++;
                }
            }
        }
        float percentage_Head=findPercentage(head,limit);
        System.out.println("\nPercentage of occurrence of Head = "+percentage_Head+"%");
        float percentage_Tail=findPercentage(tail,limit);
        System.out.println("Percentage of occurrence of Tail = "+percentage_Tail+"%");
    }
    public static float findPercentage(int side,int times) {
        float percentage=(float)(side*100)/times;
        return percentage;
        }
    }



