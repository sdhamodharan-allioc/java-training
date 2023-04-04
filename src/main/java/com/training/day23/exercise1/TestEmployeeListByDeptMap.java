package com.training.day23.exercise1;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TestEmployeeListByDeptMap {

    public static void main(String[] args) {
        EmployeeListByDeptMap employeeListByDeptMap = new EmployeeListByDeptMap();
        
        employeeListByDeptMap.add(new Employee(101, "Rama", 25000, "Computers"));
        employeeListByDeptMap.add(new Employee(102, "Krishna", 15000, "Electronics"));
        employeeListByDeptMap.add(new Employee(103, "Siva", 50000, "IT"));
        employeeListByDeptMap.add(new Employee(104, "Rama", 35000, "Electronics"));
        employeeListByDeptMap.add(new Employee(105, "Bheem", 40000, "IT"));
        employeeListByDeptMap.add(new Employee(106, "Radha", 50000, "Maths"));
        employeeListByDeptMap.add(new Employee(107, "Bavitha", 25000, "Admin"));
        employeeListByDeptMap.add(new Employee(108, "Kavitha", 10000, "Computers"));
        employeeListByDeptMap.add(new Employee(109, "Bhanu", 17000, "Maths"));
        employeeListByDeptMap.add(new Employee(110, "Meeee", 100000, "IT"));

        Iterator<String> deptIter = employeeListByDeptMap.keySet().iterator();
        while(deptIter.hasNext()){
            String dept = deptIter.next();
            EmployeeList
                    employeeList = (EmployeeList) employeeListByDeptMap.get(dept);
            System.out.println("Dept : "+dept + employeeList );
        }

    }
}
