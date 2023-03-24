package com.training.day14.string;

public class NumberofWords {
    public static void main(String[] args) {
        String givenString = "Knowledge is power";
        String[] strArray = givenString.split(" ");

        System.out.println("Given Sentence:");
        for(int i =0; i< strArray.length; i++)
        {
            System.out.println(strArray[i]);
        }
        System.out.println("Number of Words: " + strArray.length);
    }
}
