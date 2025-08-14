package com.group0505team2.dto;

import com.group0505team2.entity.Transaction;
import com.group0505team2.entity.User;

import java.util.List;

public class AccountResponseDTO {
    private int id;
    private String accountName;
    private int  userId;
    private double balance;
    private List<Transaction> transactions;

    public AccountResponseDTO(int id, String accountName, int userId, double balance, List<Transaction> transactions) {
        this.id = id;
        this.accountName = accountName;
        this.userId = userId;
        this.balance = balance;
        this.transactions = transactions;
    }

    public int getId() {
        return id;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getUserId() {
        return userId;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
