package com.group0505team2.repository.repositoryinterface;

import com.group0505team2.entity.Transaction;
import com.group0505team2.enums.Category;

import java.time.LocalDate;
import java.util.List;

public interface TransactionRepositoryInterface {
    Transaction create(Transaction transaction);

    void update(Transaction transaction);

    void delete(long id);

    Transaction findById(long id);

    List<Transaction> findByDate(LocalDate start, LocalDate finish);

    List<Transaction> findByCategory(Category category);

    List<Transaction> findAll();

    void createAll(List<Transaction> transactions);
}