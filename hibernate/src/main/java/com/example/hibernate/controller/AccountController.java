package com.example.hibernate.controller;


import com.example.hibernate.entity.Account;
import com.example.hibernate.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/workintech/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id) {
        return accountService.getAccountById(id);
    }

    @PostMapping("/{customerId}")
    public Account addAccount(@PathVariable Long customerId, @RequestBody Account account) {
        return accountService.addAccount(customerId, account);
    }

    @PutMapping("/{customerId}")
    public Account updateAccount(@PathVariable Long customerId, @RequestBody Account account) {
        return accountService.updateAccount(customerId, account);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
    }
}
