package com.training.day14.exception;

import java.io.*;
class Parent{

    // defining the method
    void msg() throws Exception {
        System.out.println("parent method");
    }
}

public class TestExceptionChild extends Parent{
    // overriding the method in child class
    // gives compile time error
    void msg() throws IOException {
        System.out.println("TestExceptionChild");
        throw new IOException("sub class ");
    }

    public static void main(String args[]) {
        Parent p = new TestExceptionChild();
        try {
            p.msg();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}