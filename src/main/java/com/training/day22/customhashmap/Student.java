package com.training.day22.customhashmap;

import java.util.Objects;

public class Student {
    private  int rollno;
    private String name;

    public int getData() {
        return rollno;
    }

    public void setData(int data) {
        this.rollno = data;
    }

    public Student(int rollNo, String name) {
        super();
        this.rollno = rollNo;
        this.name =  name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int val = rollno % 10;
        System.out.println("hshcode val : "+val);
        return val;   // 15 - hashval -5, 25 - 5
       // return Objects.hash(RollNo, Name);
    }

    public void setName(String name) {
        this.name = name;

    }
}
