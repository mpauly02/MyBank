package com.example.michaelpauly.accounts;

import android.util.Log;

import com.example.michaelpauly.accounts.BankAccount;

/**
 * Created by Michael Pauly on 5/27/2015.
 */
public class SavingsAccount extends BankAccount {
    private static final String TAG = "SavingsAccount";
    @Override
    public void withdraw(double amount) {
        if(numberOfWithdrawals() >= 3) {
            return;
        }
        super.withdraw(amount);
        Log.d(TAG, "Withdraw From Savings");
    }
}
