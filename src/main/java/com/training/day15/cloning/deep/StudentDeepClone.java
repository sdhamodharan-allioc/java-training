package com.training.day15.cloning.deep;

public class StudentDeepClone implements Cloneable {
    int id;

    String name;

    Course course;

    public StudentDeepClone(int id, String name, Course course) {
        this.id = id;

        this.name = name;

        this.course = course;
    }

    //Overriding clone() method to create a deep copy of an object.

    protected Object clone() throws CloneNotSupportedException {
        StudentDeepClone student = (StudentDeepClone) super.clone();

        student.course = (Course) course.clone();

        return student;
    }
}
