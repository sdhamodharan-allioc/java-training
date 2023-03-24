package com.training.day14.string;

import java.util.Scanner;

public class Ignorecase {
    public static void main(String[] args) {
        System.out.println("Input String1:");
        Scanner scr = new Scanner(System.in);
        String s1 = scr.nextLine();
        System.out.println("Input String2:");
        Scanner scr1 = new Scanner(System.in);
        String s2 = scr1.nextLine();
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Inputs are same");
        }
    }
}
