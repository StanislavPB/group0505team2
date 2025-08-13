package com.group0505team2.dto;

import jdk.jfr.Category;

import java.time.LocalDate;

public class TransactionResponseDTO {
    private int id;
    private LocalDate date;
    private String desc;
    private Category category;
    private double amount;

    public TransactionResponseDTO(int id, LocalDate date, String desc, Category category, double amount) {
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
}
