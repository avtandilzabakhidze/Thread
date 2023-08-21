package com.omedia.raiceConditionExample;

public class Test {
    public static void main(String[] args) {
        Bank account = new Bank(10);

        Thread fred = new Thread(() -> {
            if (account.getBalance() >= 10) {
                account.withdraw(10);
            }
        });
        Thread lucy = new Thread(() -> {
            if (account.getBalance() >= 10) {
                account.withdraw(10);
            }
        });

        fred.start();
        lucy.start();

        try {
            fred.join();
            lucy.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("balance = " + account.getBalance());
    }
}
