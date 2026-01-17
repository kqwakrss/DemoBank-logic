package com.example.DemoBank.service;

import org.springframework.stereotype.Service;
import com.example.DemoBank.model.Account;
import com.example.DemoBank.status.AccountStatus;

import java.util.HashMap;
import java.util.Map;

@Service
public class AccountService {
    private final Map<Long, Account> accounts = new HashMap<>();
    private long nextId = 1;
    public long createAccount(long initialBalance) {
        if (initialBalance <= 0) {
        throw new IllegalArgumentException("Balance must be bigger than 0");
        }
        Account account = new Account(initialBalance);
        account.active();

        long id = nextId++;
        accounts.put(id, account);
        return id;
    }

    public boolean isValid(long id) {
        Account account = accounts.get(id);
        if (account == null) {
            return false;
        }
        return account.getStatus() == AccountStatus.ACTIVE;
    }

    public Account getAccount(long id) {
        Account account = accounts.get(id);
        if (account == null) {
            throw new RuntimeException("Account not found");
            }
            return account;
    }
    public void deposit(long id, long amount) {
        Account account = getAccount(id);
        account.deposit(amount);
    }
    public void block(long id) {
        Account account = getAccount(id);
        account.block();
    }
}