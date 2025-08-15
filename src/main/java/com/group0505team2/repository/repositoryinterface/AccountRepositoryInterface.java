package com.group0505team2.repository.repositoryinterface;

import com.group0505team2.entity.Account;

import java.util.List;

public interface AccountRepositoryInterface {
    Account create(Account account);
    Account read(int id);
    void update(Account account);
    void delete(int id);
    Account findById(int id);
    List<Account> findAll();
}