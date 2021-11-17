package com.company.Classesisubclas;

public class Employee {

    private int id;
    private String name;
    private int ssn;
    private int salary;

    public Employee (int id, String name, int ssn, int salary) {
        this.id = id;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void raiseSalary(double increment) {
        this.salary = this.salary + (int)(this.salary * increment);
    }

    public void display(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("SSN: " + this.ssn);
        System.out.println("Salary: " + this.salary);
    }
}
