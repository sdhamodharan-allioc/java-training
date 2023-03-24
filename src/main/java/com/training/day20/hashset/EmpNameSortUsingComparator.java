package com.training.day20.hashset;

import java.util.Comparator;

public class EmpNameSortUsingComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2)
    {
        return o1.getEmpName().compareToIgnoreCase(o2.getEmpName());
    }

}
