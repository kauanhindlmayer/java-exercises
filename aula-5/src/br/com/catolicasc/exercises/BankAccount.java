package br.com.catolicasc.exercises;

public class BankAccount {

    static int quantityAccounts;

    private final int accountNumber = quantityAccounts;

    private double balance;

    public BankAccount(double balance) {
        quantityAccounts += 1;
        this.balance = balance;
    }

    int getAccountNumber() {
        return this.accountNumber;
    }

    void withdrawMoney(double value) {
        if(this.balance > value) {
            this.balance -= value;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    double checkBalance() {
        return this.balance;
    }

    void checkAccount() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + this.balance);
    }

    void depositMoney(double value) {
        this.balance += value;
        System.out.println("Your balance now is " + balance);
    }
}
