package com.training.day14.string;

public class NumberofWords {
    public static void main(String[] args) {
        int count=0;
        String givenString = "Knowledge is power";
        String[] strArray = givenString.split(" ");

        System.out.println("Array Length: " + strArray.length);
        System.out.println("Given Sentence:");
        for(int i =0; i< strArray.length; i++)
        {
            System.out.println(strArray[i]);
            count++;
        }

        System.out.println("No of Words:" + count);
    }
}
