package entities;

public class Account {
    private int accountNumber;
    private String holder;
    private double balance = 0;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setHolderAccount(String holder) {
        this.holder = holder;
    }

    public String getHolderString() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount - 5.0;
    }

    public String toString() {
        return "Account " + accountNumber
                + ", Holder: " + holder
                + ", Balance: $ " + String.format("%.2f", balance);
    }

}
