package com.omedia.raiceConditionExample;

public class Bank {
    private long balance;

    public Bank(long balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(long amount) {
        balance -= amount;
    }

    public synchronized long getBalance() {
        return balance;
    }
}
