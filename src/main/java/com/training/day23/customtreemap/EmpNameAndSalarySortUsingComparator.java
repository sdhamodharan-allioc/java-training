package com.training.day23.customtreemap;

import java.util.Comparator;

public class EmpNameAndSalarySortUsingComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe firstEmp, Employe secEmp) {

        int nameCompResult = firstEmp.getEmpName().compareToIgnoreCase(secEmp.getEmpName());
        if(nameCompResult == 0){
            return firstEmp.getSalary() - secEmp.getSalary();
        }else
        {
            return nameCompResult;
        }
    }
}
