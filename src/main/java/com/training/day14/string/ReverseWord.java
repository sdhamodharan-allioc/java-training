package com.training.day14.string;

public class ReverseWord
{
    public static void main(String[] args)
    {
        String givenString = "Hello";
        String revString = "";
        for (int i = givenString.length() - 1; i >= 0; i--)
        {
            revString = revString + givenString.charAt(i);
        }
        System.out.print("The reversed string of the '" +givenString + "' is: ");
        System.out.println(revString);
    }
}
