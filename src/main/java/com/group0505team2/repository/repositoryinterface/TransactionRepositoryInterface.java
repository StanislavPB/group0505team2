package com.group0505team2.repository.repositoryinterface;

import com.group0505team2.entity.Transaction;
import com.group0505team2.enums.Category;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TransactionRepositoryInterface {
    Transaction create(Transaction transaction);

    boolean update(Transaction transaction);

    boolean delete(int id);

    Optional<Transaction> findById(int id);

    List<Transaction> findByDate(LocalDate start, LocalDate finish);

    List<Transaction> findByCategory(Category category);

    List<Transaction> findAll();
}