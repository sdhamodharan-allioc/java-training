package com.training.day20.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CustomArrayList {

    public static void main(String[] args) {

        List<Employee> arrayList = new ArrayList<Employee>();

        arrayList.add(new Employee(101,"Rama",10000));
        arrayList.add(new Employee(108,"Sita",50000));
        arrayList.add(new Employee(104,"Krishna",70000));
        arrayList.add(new Employee(102,"Sai",99000));
        arrayList.add(new Employee(105,"Krish",25000));

        System.out.println("arrayList of Employee objects before sorting :: "+arrayList);
        Collections.sort(arrayList);
        System.out.println("arrayList of Employee objects after sorting :: "+arrayList);

    }

}
