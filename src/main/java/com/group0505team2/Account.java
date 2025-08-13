package com.group0505team2;

import java.util.List;
import java.util.Objects;

public class Account {
    private int id;
    private User user;
    private double balance;
    private List<Transaction> transactions;

    public Account(int id, User user, double balance, List<Transaction> transactions) {
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

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", user=" + user +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, balance, transactions);
    }
}
