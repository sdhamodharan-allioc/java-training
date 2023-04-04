package com.training.day23.exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList extends ArrayList<Employee> {
    private Double highestSalary = 0d;
    private Double totalSalaryInDept = 0d;

    public boolean add(Employee employee) {
        if(highestSalary < employee.getSalary()){
            highestSalary = employee.getSalary();
        }
        totalSalaryInDept += employee.getSalary();
        return super.add(employee);
    }

    public Double getHighestSalary(){
        return highestSalary;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(", Count =").append(size());
        sb.append(", Highest Salary : ").append(highestSalary);
        sb.append(", Average Salary : ").append(totalSalaryInDept /size());

        Iterator<Employee> employeeIterator = iterator();
        sb.append("\nEmployee with Salary greater than 20000 \n");
        while(employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            if(employee.getSalary() > 20000){
                sb.append(employee);
            }
        }

        return sb.toString();
    }
}
