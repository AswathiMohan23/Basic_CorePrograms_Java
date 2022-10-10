package com.java.functional;
//a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
//standard input and printing them out to standard output.
//b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
//c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
//d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
//OutputStreamWriter to print the output to the screen.

import java.util.Scanner;

public class Array2D {
    public static void main(String args[]) {
        System.out.println("enter the no of rows : ");
        Scanner sc = new Scanner(System.in);
        int j,i;
        int rowSize = sc.nextInt();
        System.out.println("enter the no of columns : ");
        int columnSize = sc.nextInt();
        int[][] array = new int[rowSize][columnSize];
        System.out.println("enter the elements  : ");
        for (i = 0; i < rowSize; i++) {
            for (j = 0; j < columnSize; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        //printing the array
        System.out.println("the 2D array is   : ");
        for(i=0;i<rowSize;i++){
            for(j=0;j<columnSize;j++){
                System.out.println(array[i][j]+ " ");
            }
            System.out.println();

        }

    }
}