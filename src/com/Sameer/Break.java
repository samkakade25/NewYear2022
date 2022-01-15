package com.Sameer;

import java.lang.management.PlatformManagedObject;
import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Fruits = in.next();
        switch (Fruits) {
            case "mango":
                System.out.println("King of fruits");
                break;
            case "orange":
                System.out.println("Orange in color");
                break;
            default:
                System.out.println("Invalid Input");

        }

    }
}
