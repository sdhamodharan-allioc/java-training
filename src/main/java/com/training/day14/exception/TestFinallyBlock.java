package com.training.day14.exception;

import java.util.Scanner;

public class TestFinallyBlock {
    public static void main(String args[]) {
        try {
//below code do not throw any exception
            Scanner s = new Scanner(System.in);
            String s1 = null;
            System.out.println(s1.length());
            Integer a = s.nextInt();
            int data = 25 / a;
            System.out.println(data);
        }
//catch won't be executed
        catch (NullPointerException e) {
            System.out.println(e);
        }
//executed regardless of exception occurred or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code...");
    }
}
