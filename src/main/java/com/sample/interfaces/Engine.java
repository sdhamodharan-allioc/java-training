package com.sample.interfaces;

public abstract class Engine implements IEngine{

    private String name;
    private boolean alignWheels;
    public Engine(String name){
        this.name = name;
        alignWheels = false;
    }
    private void alignWheels(){
        alignWheels = true;
        System.out.println("Align wheels of :"+name);
    }
    public void rotateWheels(){
        alignWheels();
        System.out.println("Rotate wheels of : "+name);
    }
}
