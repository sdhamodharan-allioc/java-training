package com.training.day6;

public class Rectangle1 implements Polygon{
        public void getarea(){
        int length = 5;
        int breadth = 5;
        int Area = length * breadth;
        System.out.println("Area:" + Area);
      }
        public void getSizes()
        {
            System.out.println("Rectangle have 4 sides");
        }
   }
