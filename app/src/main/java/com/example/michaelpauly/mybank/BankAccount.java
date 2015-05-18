package com.example.michaelpauly.mybank;

/**
 * Created by Michael on 5/15/2015.
 */
public class BankAccount {
    private double balance;

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
