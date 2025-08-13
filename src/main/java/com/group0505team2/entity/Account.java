package com.group0505team2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Account {
    private int id;
    // добавить наименование счета
    private int  userId;// !!!!! подправить !!!!
    private double balance;
    private List<Transaction> transactions;

    public Account(int id, int userId) {
        this.id = id;
        this.userId = userId;
        this.balance = 0;
        this.transactions = new ArrayList<>();
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

    // добавить метод addNewTransaction

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
