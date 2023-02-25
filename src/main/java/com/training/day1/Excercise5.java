package com.training.day1;

public class Excercise5 {
    public static void main(String[] args) {
        int FirstValue, SecondValue, Result, n;
        FirstValue = 1;
        SecondValue = 1;
        Result=0;
        n = 10;
        System.out.print(FirstValue);
        System.out.print(     " " +SecondValue);
        for ( int i = 1; i <= n; i++) {
            Result = FirstValue + SecondValue;
            FirstValue = SecondValue;
            SecondValue = Result;
            System.out.print( " "+Result);
        }
    }
}