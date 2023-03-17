package com.training.day14.exception;
import java.io.IOException;

class TestExceptionPropagation2{
    void m() throws IOException{
        throw new java.io.IOException("device error");//checked exception
    }
    void n() throws IOException{
        m();
    }
    void p() throws IOException{
        try{
            n();
        }catch(Exception e){
            System.out.println("exception handled");
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        TestExceptionPropagation2 obj=new TestExceptionPropagation2();
        try {
            obj.p();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("normal flow");
    }
}