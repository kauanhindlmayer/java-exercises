public class BankAccount {
    int accountNumber;
    String holder;
    double balance;

    public BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
    }

    void withdrawMoney(double value) {
        if(this.balance > value) {
            this.balance -= value;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    void checkBalance() {
        System.out.println(this.balance);
    }

    void checkAccount() {
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Holder " + this.holder);
        System.out.println("Balance: " + this.balance);
    }

    void depositMoney(double value) {
        this.balance += value;
        System.out.println("Your balance now is " + balance);
    }
}