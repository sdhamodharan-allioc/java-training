package com.training.day1;

public class Exercise2 {
    public static void main(String[] args) {
        int i, j, n;
        n = 5;
        for (i = n; i>= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}