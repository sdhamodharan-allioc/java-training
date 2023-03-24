package com.training.day20.hashset;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomArrayListWithComparator {

    public static void main(String[] args) {

        List<Employee> arrayList = new ArrayList<Employee>();

        arrayList.add(new Employee(101,"Rama",10000));
        arrayList.add(new Employee(108,"Sita",50000));
        arrayList.add(new Employee(104,"Krishna",70000));
        arrayList.add(new Employee(102,"Sai",99000));
        arrayList.add(new Employee(105,"Krish",25000));

        System.out.println("arrayList of Employee objects before sorting :: "+arrayList);

        Collections.sort(arrayList, new EmpIdSortUsingComparator());

        System.out.println("arrayList of Employee objects after empId based sorting :: "+arrayList);

        Collections.sort(arrayList, new EmpNameSortUsingComparator());

        System.out.println("arrayList of Employee objects after empName based sorting :: "+arrayList);

      Collections.sort(arrayList, new Comparator<Employee>() {
         @Override
         public int compare(Employee o1, Employee o2) {
             return o1.getSalary() - o2.getSalary() ;
           }

       });

        System.out.println("arrayList of Employee objects after Salary based sorting :: "+arrayList);

    }

}
