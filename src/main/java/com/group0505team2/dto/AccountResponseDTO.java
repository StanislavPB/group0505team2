package com.group0505team2.dto;

import com.group0505team2.entity.Transaction;

import java.util.List;

public class AccountResponseDTO {
    private final int id;
    private final String accountName;
    private final int  userId;
    private final double balance;
    private final List<Transaction> transactions;

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