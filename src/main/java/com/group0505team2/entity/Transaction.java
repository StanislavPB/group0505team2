package com.group0505team2.entity;

import com.group0505team2.enums.OperationType;
import jdk.jfr.Category;

import java.time.LocalDate;
import java.util.Objects;

public class Transaction {
    private static int nextId = 1;
    private final int id;
    private final LocalDate date;
    private final String description;
    private final Category category;
    private final OperationType operationType;
    private final double amount;

    public Transaction(String description, Category category, OperationType operationType, double amount) {
        this.id = nextId++;
        this.date = LocalDate.now();
        this.description = description;
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

    public String getDescription() {
        return description;
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
                ", desc='" + description + '\'' +
                ", category=" + category +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, description, category, amount);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return id == that.id &&
                Double.compare(that.amount, amount) == 0 &&
                date.equals(that.date) &&
                Objects.equals(description, that.description) &&
                category == that.category &&
                operationType == that.operationType;
    }

}