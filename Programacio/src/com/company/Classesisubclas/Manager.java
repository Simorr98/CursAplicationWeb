package com.company.Classesisubclas;

public class Manager extends Employee{

    private final int MAX_EMPLOYEES = 20;
    private int numEmployees;

    private String department;
    private Employee[] employees;

    public Manager(int id, String name, int ssn, int salary, String department) {
        super(id, name, ssn, salary);
        this.department = department;
        this.employees = new Employee[MAX_EMPLOYEES];
        numEmployees = 0;
    }

    public int findEmployee (Employee e) {
        for (int i = 0; i < this.numEmployees; i++) {
            if (employees[i].getId() == e.getId()) {
                return i;
            }
        }
        return -1;
    }

    public boolean addEmployee(Employee e) {
        if (findEmployee(e) == -1) {
            this.employees[numEmployees] = e;
            this.numEmployees++;
            return true;
        }
        return false;
    }

    public boolean removeEmployee(Employee e) {
        int employeeToRemoveIndex = findEmployee(e);

        if (employeeToRemoveIndex != -1) {
            Employee[] auxEmployees = new Employee[MAX_EMPLOYEES];
            for (int i = 0; i < this.numEmployees; i++) {
                if (i < employeeToRemoveIndex) {
                    auxEmployees[i] = this.employees[i];
                } else  {
                    auxEmployees[i] = this.employees[i + 1];
                }
            }
            this.employees = auxEmployees;
            this.numEmployees--;
            return true;
        }
        return false;
    }

    public String getDepartment() {
        return this.department;
    }

    public void printStaffDetails() {
        display();
        System.out.println("\nEmployee list: ");
        for (int i = 0; i < this.numEmployees; i++) {
            System.out.println();
            employees[i].display();
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + this.department);
    }
}
