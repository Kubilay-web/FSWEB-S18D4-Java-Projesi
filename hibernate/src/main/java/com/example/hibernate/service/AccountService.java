package com.example.hibernate.service;

import com.example.hibernate.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();
    Account getAccountById(Long id);
    Account addAccount(Long customerId,Account account);

    Account updateAccount(Long id, Account account);
    void deleteAccount(Long id);
}
