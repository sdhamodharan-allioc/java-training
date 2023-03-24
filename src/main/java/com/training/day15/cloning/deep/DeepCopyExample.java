package com.training.day15.cloning.deep;

class ABC1
{
    // instance variable of the class ABC
    int x = 30;
}
public class DeepCopyExample
{
    // main method
    public static void main(String argvs[])
    {
// creating an object of the class ABC
        ABC1 obj1 = new ABC1();

// it will copy the reference, not value
        ABC1 obj2 = new ABC1();

// updating the value to 6
// using the reference variable obj2
        obj2.x = 6;

// printing the value of x using reference variable obj1
        System.out.println("The value of x is: " + obj1.x);
    }
}