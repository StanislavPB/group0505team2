package com.group0505team2.entity;

import com.group0505team2.enums.OperationType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Account {
    private int id;
    private final String accountName;
    private final int userId;
    private double balance;
    private final List<Transaction> transactions;

    public Account(int id, String accountName, int userId) {
        this.id = id;
        this.accountName = accountName;
        this.userId = userId;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void addNewTransaction(Transaction transaction) {
        if (transaction == null) {
            throw new IllegalArgumentException("Transaction cannot be null");
        }
        if (transaction.getOperationType() == OperationType.EXPENSE && balance + transaction.getAmount() < 0) {
            throw new IllegalArgumentException("Insufficient funds for expense");
        }
        transactions.add(transaction);
        balance += transaction.getAmount();
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", userId='" + userId + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountName, userId, balance, transactions);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                userId == account.userId &&
                Double.compare(account.balance, balance) == 0 &&
                accountName.equals(account.accountName) &&
                transactions.equals(account.transactions);
    }

}