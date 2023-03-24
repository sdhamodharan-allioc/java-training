package com.training.day21.hashset;

import java.util.HashSet;
import java.util.Set;


    public class CustomHashSet {

        public static void main(String[] args) {

            Set<Product> setElements = new HashSet<Product>();

            setElements.add(new Product(101,"Fan",2500f));
            setElements.add(new Product(109,"Toy",10000f));
            setElements.add(new Product(101,"Hispeed Fan",5000f));
            setElements.add(new Product(107,"Water Bottle",1000f));
            setElements.add(new Product(106,"Mobile",22500f));
            setElements.add(new Product(102,"Fan",2500f));

            System.out.println("Custom setElements :: "+setElements);
        }

    }

