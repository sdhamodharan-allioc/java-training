package com.training.day14.string;

public class CharOccurenceCount {
    public static void main(String[] args) {
            int count = 0;
            String givenString = "Hello World";
            System.out.println("GivenString:" +givenString);
            for(int index = 0; index < givenString.length(); index++)
            {
                if (givenString.charAt(index) =='l')
                {
                    System.out.println("position of l:" +index);
                    count++;
                }
            }
            System.out.println("No of Occurences:" + count);
    }
}
