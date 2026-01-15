package com.example.DemoBank.service;

import org.springframework.stereotype.Service;
import com.example.DemoBank.model.Account;

@Service
public class AccountService {
    public Account createAccount(long initialBalance) {
        if (initialBalance <= 0) {
        throw new IllegalArgumentException("Balance must be bigger than 0");
        }
        Account account = new Account(initialBalance);
        account.active();
        System.out.println(account.getStatus());
        return account;
    }
}