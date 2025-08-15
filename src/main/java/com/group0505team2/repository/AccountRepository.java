package com.group0505team2.repository;

import com.group0505team2.entity.Account;
import com.group0505team2.repository.repositoryinterface.AccountRepositoryInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountRepository implements AccountRepositoryInterface {
    private final List<Account> accounts;
    private int nextId = 1;

    public AccountRepository() {
        this.accounts = new ArrayList<>();
    }

    public Account create(Account account) {
        account.setId(nextId++);
        accounts.add(account);
        return account;
    }

    public boolean update(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == account.getId()) {
                accounts.set(i, account);
                return true;
            }
        }
        return false;
    }

    public boolean delete(int id) {
        return accounts.removeIf(account -> account.getId() == id);
    }

    public Optional<Account> findById(int id) {
        return accounts.stream()
                .filter(account -> account.getId() == id).findFirst();
    }

    public List<Account> findAll() {
        return new ArrayList<>(accounts);
    }

}