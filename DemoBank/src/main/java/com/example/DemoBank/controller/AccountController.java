package com.example.DemoBank.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.DemoBank.service.AccountService;
import com.example.DemoBank.model.Account;
import com.example.DemoBank.service.DepositRequest;


@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public void createAccount(@RequestBody CreateAccountRequest request) {
        accountService.createAccount(request.initialBalance);
    }
    @GetMapping("/{id}")
    public Account getAccount(@PathVariable long id) {
        return accountService.getAccount(id);
    } 
    @GetMapping("/{id}/validation")
    public boolean validation(@PathVariable long id) {
        return accountService.isValid(id);
    }
    @PostMapping("/{id}/deposit")
    public void deposit(@PathVariable long id, @RequestBody DepositRequest request){
        accountService.deposit(id, request.amount);
    }

    @PostMapping("/{id}/block")
    public void block(@PathVariable long id) {
        accountService.block(id);
    }
}

