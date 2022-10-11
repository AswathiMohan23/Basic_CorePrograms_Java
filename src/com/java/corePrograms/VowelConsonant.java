package com.java.corePrograms;
import java.util.Scanner;

//1. Write a Program to Check whether an alphabet is Vowel or Consonant
//   ==================================================================

public class VowelConsonant {
    public static void main(String[] args){
        System.out.println("Enter the alphabet : ");
        Scanner sc=new Scanner(System.in);
        char alphabet=sc.next().charAt(0);
        switch(alphabet){
            case 'A':
                System.out.println("alphabet = A ie, a vowel");
                break;
            case 'E':
                System.out.println("alphabet = E ie, a vowel");
                break;
            case 'I':
                System.out.println("alphabet = I ie, a vowel");
                break;
            case 'O':
                System.out.println("alphabet = O ie, a vowel");
                break;
            case 'U':
                System.out.println("alphabet = U ie, a vowel");
                break;
            case 'a':
                System.out.println("alphabet = a ie, a vowel");
                break;
            case 'e':
                System.out.println("alphabet = e ie, a vowel");
                break;
            case 'i':
                System.out.println("alphabet = i ie, a vowel");
                break;
            case 'o':
                System.out.println("alphabet = o ie, a vowel");
                break;
            case 'u':
                System.out.println("alphabet = u ie, a vowel");
                break;
            default:
                System.out.println("alphabet = "+alphabet +" ie, a consonant");
                break;
        }
    }
}
