package com.training.day14.exception;

public class ArthiExcep {
    public static void main(String[] args) {
        int i;
        try {
            int a[] = new int[5];
            a[10] = 20 / 0;
            // Arithmetic Exception is thrown because that division by zero error happens first
            // if above assignment is commented then ArrayIndexBound of Exception can  be thrown
            System.out.println(a[10]);
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println(aiobe);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e1) {
            System.out.println(e1);
        }
        String s = "java";
        try {
            int j = Integer.parseInt(s);
            System.out.println(j);
        } catch (NumberFormatException n) {
            System.out.println(n);
        }
        System.out.println("rest of the pgm");
    }
}
