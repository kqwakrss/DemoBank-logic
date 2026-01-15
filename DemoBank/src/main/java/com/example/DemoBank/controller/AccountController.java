package com.example.DemoBank.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/account")
public class AccountController {
    @GetMapping("/{id}/validation")
    public boolean validateAccount(@PathVariable long id) {
        return true;
    }
}
