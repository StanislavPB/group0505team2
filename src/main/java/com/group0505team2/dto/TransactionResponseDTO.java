package com.group0505team2.dto;

import jdk.jfr.Category;

import java.time.LocalDate;

public class TransactionResponseDTO {
    private int id;
    private String date;
    private String description;
    private String categoryName;
    private Double amount;

    public TransactionResponseDTO(int id, String date, String description, String categoryName, Double amount) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.categoryName = categoryName;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Double getAmount() {
        return amount;
    }
}
