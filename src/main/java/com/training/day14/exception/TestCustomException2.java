package com.training.day14.exception;

// class representing custom exception
class MyCustomException extends Exception
{
    private  String errorCode;

    public MyCustomException(String message){
        super(message);
    }

    public MyCustomException(String message, String errorCode){
        this(message + ":"+errorCode);
        this.errorCode = errorCode;

    }
}

// class that uses custom exception MyCustomException
public class TestCustomException2
{
    // main method
    public static void main(String args[])
    {
        try
        {
            // throw an object of user defined exception
            throw new MyCustomException("My Custom Exception", "1002");
        }
        catch (MyCustomException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }

        System.out.println("rest of the code...");
    }
}
