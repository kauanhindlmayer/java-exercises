package br.com.catolicasc.exercises;

public class Employee {
    private String name;
    private String department;
    private double salary;
    private String entryDate;
    private String rg;
    private boolean isOnCompany;

    static int identifier;

    public Employee(String name) {
        identifier += 1;
        this.isOnCompany = true;
        this.name = name;
    }

    public Employee() {
        this.isOnCompany = true;
        identifier += 1;
    }

    void bonus(double value) {
        this.salary += value;
    }

    void dismiss() {
        this.isOnCompany = false;
    }

    void info() {
        System.out.println("ID: " + identifier);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Entry Date: " + entryDate);
        System.out.println("RG: " + rg);
        System.out.println("Is on company: " + isOnCompany);
    }

    void setName(String value) {
        this.name = value;
    }

    void setDepartment(String value) {
        this.department = value;
    }

    void setSalary(double value) {
        this.salary = value;
    }

    void setEntryDate(String value) {
        this.entryDate = value;
    }

    void setRg(String value) {
        this.rg = value;
    }

    void getIdentifier() {
        System.out.println(identifier);
    }

    void getName() {
        System.out.println(name);
    }

    void getDepartment() {
        System.out.println(department);
    }

    void getSalary() {
        System.out.println(salary);
    }

    void getEntryDate() {
        System.out.println(entryDate);
    }

    void getRg() {
        System.out.println(rg);
    }
}
