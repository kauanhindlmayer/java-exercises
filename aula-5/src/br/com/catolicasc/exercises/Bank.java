package br.com.catolicasc.exercises;

public class Bank {
    private String name;
    private int bank_id;
    BankAccount[] accounts = new BankAccount[10];

    public void addAccount(BankAccount account) {
        for (int i = 0; i < this.accounts.length; i++) {
            if(this.accounts[i] == null) {
                this.accounts[i] = account;
                return;
            }
            this.increaseAccountsAmount();
        }
    }

    public void increaseAccountsAmount() {
        int newAmount = this.accounts.length * 2;
        BankAccount[] newAccounts = new BankAccount[newAmount];
        for (int i = 0; i < this.accounts.length; i++) {
            newAccounts[i] = this.accounts[i];
        }
        this.accounts = newAccounts;
    }

    void showAllAccounts() {
        for (int i = 0; i < this.accounts.length; i++) {
            BankAccount account = this.accounts[i];
            if (account != null) {
                account.checkAccount();
            }
        }
    }

    boolean contains(BankAccount account) {
        for (int i = 0; i < this.accounts.length; i++) {
            if (account.equals(this.accounts[i])) {
                return true;
            }
        }
        return false;
    }
}
