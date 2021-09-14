package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.printf("Enter the first number: ");
        String first = reader.nextLine();
        System.out.printf("Enter the second number: ");
        String second = reader.nextLine();
        System.out.printf("Enter the third number: ");
        String third = reader.nextLine();

        int num1 = Integer.parseInt(first);
        int num2 = Integer.parseInt(second);
        int num3 = Integer.parseInt(third);
        int largest = 0;

        if (num1 > num2) {
            largest = num1;
        }
        else {
            largest = num2;
        }

        if (largest < num3) {
            largest = num3;
        }

        System.out.printf("The largest number is %d.", largest);

    }
}