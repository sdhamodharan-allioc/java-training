package com.training.day23.exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Key : Dept, Value : EmployeeList
 * */
public class EmployeeListByDeptMap extends HashMap<String, EmployeeList> {


    public void add(Employee employee){
        EmployeeList employeeList = get(employee.getDepartment());
        if(employeeList == null){
            employeeList = new EmployeeList();
        }
        employeeList.add(employee);
        put(employee.getDepartment(), employeeList);

    }


}
