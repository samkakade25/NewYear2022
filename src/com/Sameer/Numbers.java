package com.Sameer;

// print numbers

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num=1; num<=n; num+=1) {
            System.out.print(num  + " ");
        }
    }
}
