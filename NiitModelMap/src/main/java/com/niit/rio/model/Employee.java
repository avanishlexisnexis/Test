package com.niit.rio.model;



public class Employee 
{
    private int employeeid;
    private String employeename;
    private float salary;

    public Employee() {
    }

    public Employee(int employeeid, String employeename, float salary) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }
    
    
}
