package com.training.day23.exercise1;

import java.util.Objects;

public class Employee {
    private  int empId;
    private  String empName;
    private  double salary;
    private  String department;

    public Employee(int empId, String empName, double salary, String department) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Double.compare(employee.salary, salary) == 0 && empName.equals(employee.empName) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, salary, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}




