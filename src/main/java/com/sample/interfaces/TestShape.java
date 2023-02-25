package com.sample.interfaces;

import java.util.ArrayList;
import java.util.List;

public class TestShape {
    public static void main(String args[]) {
        //Interface instanceName = new ClassName();
        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();

        System.out.println("Call a method and draw");
        drawShape(circle);
        drawShape(rectangle);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(rectangle);

        System.out.println("Drawing using a loop.........");
        for(Shape eachShape : shapeList){
            eachShape.draw();
        }
    }

    public static void drawShape(Shape shapeObject){
        shapeObject.draw();
    }
}
