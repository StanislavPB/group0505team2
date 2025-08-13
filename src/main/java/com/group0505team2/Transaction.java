package com.group0505team2;

import jdk.jfr.Category;

import java.time.LocalDate;
import java.util.Objects;

public class Transaction {
    private int id;
    private LocalDate date;
    private String desc;
    private Category category;
    private double amount;

    public Transaction(int id, LocalDate date, String desc, Category category, double amount) {
        this.id = id;
        this.date = date;
        this.desc = desc;
        this.category = category;
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
