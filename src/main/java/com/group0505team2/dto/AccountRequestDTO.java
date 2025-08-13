package com.group0505team2.dto;

import com.group0505team2.entity.Transaction;
import com.group0505team2.entity.User;

import java.util.List;

public class AccountRequestDTO {

    private int userId;
    // добавить наименование

    public AccountRequestDTO(int id, User user, double balance, List<Transaction> transactions) {
        this.id = id;
        this.user = user;
        this.balance = balance;
        this.transactions = transactions;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
