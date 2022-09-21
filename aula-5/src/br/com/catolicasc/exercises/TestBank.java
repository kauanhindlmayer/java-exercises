package br.com.catolicasc.exercises;

public class TestBank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(10000);
        BankAccount account2 = new BankAccount(20000);
        BankAccount account3 = new BankAccount(30000);
        BankAccount account4 = new BankAccount(40000);


        Bank myBank = new Bank();
        myBank.addAccount(account1);
        myBank.addAccount(account2);
        myBank.addAccount(account3);

        myBank.showAllAccounts();

        System.out.println(myBank.contains(account4));

    }
}
