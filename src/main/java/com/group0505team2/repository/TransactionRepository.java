package com.group0505team2.repository;

import com.group0505team2.entity.Transaction;
import com.group0505team2.enums.Category;
import com.group0505team2.repository.repositoryinterface.TransactionRepositoryInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TransactionRepository implements TransactionRepositoryInterface {
    private final List<Transaction> transactions;
    private int nextId = 1;

    public TransactionRepository() {
        this.transactions = new ArrayList<>();
    }

    @Override
    public Transaction create(Transaction transaction) {
        transaction.setId(nextId++);
        transactions.add(transaction);
        return transaction;
    }

    @Override
    public boolean update(Transaction transaction) {
        for (int i = 0; i < transactions.size(); i++) {
            if (transactions.get(i).getId() == transaction.getId()) {
                transactions.set(i, transaction);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        for(Transaction transaction : transactions){
            if(transaction.getId() == id){
                transactions.remove(transaction);
                return true;
            }
        }
       return false;
    }

    @Override
    public Optional<Transaction> findById(int id) {
        for (Transaction transaction : transactions) {
            if (transaction.getId() == id) {
                return Optional.of(transaction);
            }
        }
      return Optional.empty();
    }

    public List<Transaction> findByDate(LocalDate start, LocalDate finish){
        List<Transaction> result = new ArrayList<>();
        for (Transaction transaction : transactions){
            if((transaction.getDate().isEqual(start) || transaction.getDate().isAfter(start)) &&
               (transaction.getDate().isEqual(finish) || transaction.getDate().isBefore(finish))){
                result.add(transaction);
            }
        }
        return result;
    }

    public List<Transaction> findByCategory(Category category) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getCategory().equals(category)) {
                result.add(transaction);
            }
        }
       return result;
    }

    public List<Transaction> findAll() {
        return new ArrayList<>(transactions);
    }
}
