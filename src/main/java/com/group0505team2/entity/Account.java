package com.group0505team2.entity;

import com.group0505team2.enums.OperationType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Account {
    private int nextId;
    private int id;
    private String accountName;
    private int  userId;
    private double balance;
    private List<Transaction> transactions;

    public Account(String accountName, int userId) {
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

    public void addNewTransaction(Transaction transaction){
        transactions.add(transaction);

        if(transaction.getOperationType() == OperationType.INCOME){
            this.balance += transaction.getAmount();
        } else if(transaction.getOperationType() == OperationType.EXPENSE){
            this.balance -= transaction.getAmount();
        }
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
}
