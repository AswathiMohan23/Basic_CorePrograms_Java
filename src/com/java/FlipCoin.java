package com.java;
//Flip Coin and print percentage of Heads and Tails
// I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
//Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
// O/P -> Percentage of Head vs Tails

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args){
        double randomCheck = 0;
        int head=0,tail=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("how many times do want to flip the coin : ");
        int times=sc.nextInt();
        int limit=times;
        if(times==(int) times) {
            for (int i = 0; i < times; i++) {
                randomCheck = (int) (Math.random() * (1 - 0 + 1) + 0);
                if (randomCheck < 0.5) {
                    head=head+1;
                } else {
                    tail=tail+1;}
            }
        }
        float percentage_Head=findPercentage(head,limit);
                System.out.println("Percentage of occurrence of Head = "+percentage_Head+"%");
                float percentage_Tail=findPercentage(tail,limit);
                System.out.println("Percentage of occurrence of Tail = "+percentage_Tail+"%");
    }
    public static float findPercentage(int side,int times) {
        float percentage=(float)(side*100)/times;
        return percentage;
        }
    }



