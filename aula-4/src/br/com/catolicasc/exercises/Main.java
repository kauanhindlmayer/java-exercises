package br.com.catolicasc.exercises;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Kauan");
        employee.setSalary(2000.0);
        employee.setDepartment("Fire");
        employee.setRg("000.000.000-00");
        employee.setEntryDate("09/08/2022");

        employee.info();
    }
}
