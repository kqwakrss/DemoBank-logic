package com.example.DemoBank.model;

import com.example.DemoBank.status.AccountStatus;

class Account {
    private long balance;
    private AccountStatus status;
    Account(long balance) {
        this.balance = balance;
        this.status = AccountStatus.NOTACTIVE;
    }

    void block() {
        this.status = AccountStatus.BLOCKED;
    }

    void active() {
        this.status = AccountStatus.ACTIVE;
    }
 
    long getBalance(){
        return balance;
    }
    AccountStatus getStatus(){
        return status;
    }
}


