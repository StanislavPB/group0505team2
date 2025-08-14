package com.group0505team2.entity;

import com.group0505team2.enums.OperationType;
import jdk.jfr.Category;

import java.time.LocalDate;
import java.util.Objects;

public class Transaction {
    private static int nextId = 1;
    private int id;
    private LocalDate date;
    private String desc;
    private Category category;
    private OperationType operationType;
    private double amount;

    public Transaction(String desc, Category category, OperationType operationType, double amount) {
        this.id = nextId++;
        this.date = LocalDate.now();
        this.desc = desc;
        this.category = category;
        this.operationType = operationType;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDesc() {
        return desc;
    }

    public Category getCategory() {
        return category;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", date=" + date +
                ", desc='" + desc + '\'' +
                ", category=" + category +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, desc, category, amount);
    }
}
