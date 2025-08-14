package com.group0505team2.dto;

import jdk.jfr.Category;

import java.time.LocalDate;

public class TransactionResponseDTO {
    private int id;
    private String date;
    private String desc;
    private String categoryName;
    private double amount;

    public TransactionResponseDTO(int id, String date, String desc, String categoryName, double amount) {
        this.id = id;
        this.date = date;
        this.desc = desc;
        this.categoryName = categoryName;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getDesc() {
        return desc;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public double getAmount() {
        return amount;
    }
}
