package com.training.day15.cloning.shallow;

public class StudentShallow implements Cloneable {
    int id;

    String name;

    Course course;

    public StudentShallow(int id, String name, Course course) {
        this.id = id;

        this.name = name;

        this.course = course;
    }

    //Default version of clone() method. It creates shallow copy of an object.

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
