package com.example.DemoBank.model;

import com.example.DemoBank.status.AccountStatus;

public class Account {
    private long balance;
    private AccountStatus status;
    public Account(long balance) {
        this.balance = balance;
        this.status = AccountStatus.NOTACTIVE;
    }

    public void block() {
        this.status = AccountStatus.BLOCKED;
    }

     public void notactive() {
        this.status = AccountStatus.BLOCKED;
    }

    public void active() {
        this.status = AccountStatus.ACTIVE;
    }
 
    long getBalance(){
        return balance;
    }
    public AccountStatus getStatus(){
        return status;
    }
}


