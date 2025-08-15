package com.group0505team2.repository.repositoryinterface;

import com.group0505team2.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepositoryInterface {
    Account create(Account account);

    boolean update(Account account);

    boolean delete(int id);

    Optional<Account> findById(int id);

    List<Account> findAll();
}