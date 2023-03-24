package com.training.day14.string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder input1 = new StringBuilder();
        System.out.println("Enter the String:");
        Scanner scr = new Scanner(System.in);
        String input =scr.nextLine();
        input1.append(input);
        input1.reverse();
        System.out.println("The Reversed String:");
        System.out.println(input1);
    }
}
