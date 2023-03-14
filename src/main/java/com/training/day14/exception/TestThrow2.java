package com.training.day14.exception;

    import java.io.*;

    public class TestThrow2 {

        //function to check if person is eligible to vote or not
        public  static void method() throws FileNotFoundException {

            FileReader file = new FileReader("C:\\Savithri\\java training\\src\\main\\java\\HashMap1.java");
            BufferedReader fileInput = new BufferedReader(file);
        }

        //main method
        public static void main(String args[]) {
            try {
                method();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("rest of the code...");
        }
    }
