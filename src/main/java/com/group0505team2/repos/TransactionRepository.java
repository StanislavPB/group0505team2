package com.group0505team2.repos;

import com.group0505team2.entity.Transaction;
import com.group0505team2.enums.Category;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    private List<Transaction> transactions = new ArrayList<>();

    public void create(Transaction transaction) {
        if (transaction.getCategory() == null) {
            throw new IllegalArgumentException("Category can not be null");
        }
        if (transaction.getOperationType() == null) {
            throw new IllegalArgumentException("Operation type can not be null");
        }
        if (transaction.getAmount() <= 0) {
            throw new IllegalArgumentException("Amount has to be > 0");
        }
        if (transaction == null) {
            throw new IllegalArgumentException("Transaction can not be null");
        }
        transactions.add(transaction);
    }

    public Transaction read(int id) {
        for (Transaction t : transactions) {
            if (t.getId() == id) {
                return t;
            }
        }
        throw new IllegalArgumentException("Transaction with this id doesn't exist");
    }

    public void update(Transaction transaction) {
        if (transaction == null) {
            throw new IllegalArgumentException("Transaction can not be null");
        }
        for (int i = 0; i < transactions.size(); i++) {
            if (transactions.get(i).getId() == transaction.getId()) {
//                ????????? дата ?????????
                transactions.set(i, transaction);
                return;
            }
        }
        throw new IllegalArgumentException("Transaction with this id not found");
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
        return read(id);
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

}
