package com.company.Classesisubclas;

public class Director extends Manager{

    private double budget;

    public Director(int id, String name, int ssn, int salary, String department, double budget) {
        super(id, name, ssn, salary, department);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Budget: " + this.budget);
    }
}
