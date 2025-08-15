package com.group0505team2.repository;

import com.group0505team2.entity.Transaction;
import com.group0505team2.enums.Category;
import com.group0505team2.repository.repositoryinterface.TransactionRepositoryInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    public void update(Transaction transaction) {
        for (int i = 0; i < transactions.size(); i++) {
            if (transactions.get(i).getId() == transaction.getId()) {
                transactions.set(i, transaction);
                return;
            }
        }

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Transaction findById(int id) {
        return null;
    }

    public void delete(int id) {
        for(Transaction t : transactions){
            if(t.getId() == id){
                transactions.remove(t);
            }
        }
        throw new IllegalArgumentException("Transaction with this id not found");
    }

    public Transaction findById(int id) {
        for (Transaction t : transactions) {
            if (t.getId() == id) {
                return t;
            }
        }
        throw new IllegalArgumentException("Transaction with this id doesn't exist");
    }

    public List<Transaction> findByDate(LocalDate start, LocalDate finish){
        List<Transaction> result = new ArrayList<>();
        for (Transaction t : transactions){
            if((t.getDate().isEqual(start) || t.getDate().isAfter(start)) &&
               (t.getDate().isEqual(finish) || t.getDate().isBefore(finish))){
                result.add(t);
            }
        }
        return result;
    }

    public List<Transaction> findByCategory(Category category) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction t : transactions) {
            if (t.getCategory().equals(category)) {
                result.add(t);
            }
        }
        return result;
    }

    public List<Transaction> findAll() {
        return new ArrayList<>(transactions);
    }

    @Override
    public void createAll(List<Transaction> transactions) {

    }

}
