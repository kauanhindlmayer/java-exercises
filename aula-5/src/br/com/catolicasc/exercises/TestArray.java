package br.com.catolicasc.exercises;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        BankAccount[] accounts =  new BankAccount[10];
        double averageSalary = 0;

        Scanner reader = new Scanner(System.in);

        for(int i = 0; i < accounts.length; i++) {
            System.out.println("Type your salary: ");
            double salary = reader.nextDouble();
            accounts[i] = new BankAccount(salary);

            averageSalary += accounts[i].checkBalance();
        }

        averageSalary = averageSalary / accounts.length;

        System.out.println("Average Salary: " + averageSalary);
    }
}