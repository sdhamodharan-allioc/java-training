package com.training.day2;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner num =  new Scanner(System.in);
        int givenNumber = num.nextInt();
        int reminder, sum, temp;
        sum = 0;
        temp = givenNumber;
        while (temp > 0) {
            reminder = temp % 10;
            sum = (sum * 10) + reminder;
            temp = temp / 10;
        }
        if (sum == givenNumber) {
            System.out.println("it is a palindrome");
        }
        else
        {
            System.out.println("its not a palindrome");
        }
    }
}