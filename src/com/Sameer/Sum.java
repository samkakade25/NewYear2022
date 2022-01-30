package com.Sameer;

import java.util.Scanner;

import static java.lang.System.in;

public class Sum {
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
        sum();

    }
    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter a num2: ");
        int num2 =in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of nos: " + sum);
        return sum;
    }
}